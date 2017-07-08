package models

import anorm.SQL
import anorm.RowParser
import anorm.Macro
import javax.inject.Inject
import play.api.db.Database
import anorm.SqlParser.scalar
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException
import anorm.{Macro, RowParser}
import controllers.UsuarioAtual
import play.api.db.Database

case class Usuario(id: Int, email: String, senha: String)

class UsuarioDAO @Inject() (database: Database) {

  val parser: RowParser[models.Usuario] = Macro.namedParser[models.Usuario]

  def salvar(usuario: Usuario) : String = database.withConnection { implicit connection =>
    val id: Option[Long] = SQL(
      """INSERT INTO TB_USUARIO(EMAIL, SENHA)
            values ({EMAIL}, {SENHA})""")
      .on('EMAIL -> usuario.email,
        'SENHA -> usuario.senha).executeInsert()
    return "USUARIO CRIADO COM SUCESSO!!"
  }

  def logar(usuario: Usuario) : String = database.withConnection { implicit connection =>
    var check: Option[String] = SQL("SELECT EMAIL FROM TB_USUARIO WHERE EMAIL = {email} AND SENHA = {senha}").on('email -> usuario.email, 'senha -> usuario.senha) as scalar[String].singleOpt
    UsuarioAtual.usuario = usuario.email
    try {
      check.get
    }
    catch {
      case e: NoSuchElementException =>  "LOGIN INVALIDO, TENTE NOVAMENTE"
    }

  }

}