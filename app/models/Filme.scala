package models

import anorm.SQL
import anorm.SqlQuery
import anorm.RowParser
import anorm.Macro
import anorm.SqlStringInterpolation
import anorm.SqlParser
import play.api.db.DB
import play.api.Play.current
import javax.inject.Inject
import play.api.db.Database
import javax.inject.Singleton
import controllers.UsuarioAtual

case class Filme(titulo: String, diretor: String, anoProducao: Int)
case class Nota(filme : String, nota : Int)
case class FilmeMedia(titulo : String, diretor: String, anoProducao: Int, media : Int)

class FilmeDAO @Inject() (database: Database) {

  val parser: RowParser[models.Filme] = Macro.namedParser[models.Filme]
  val parserF: RowParser[models.FilmeMedia] = Macro.namedParser[models.FilmeMedia]

  def salvar(filme: Filme) = database.withConnection { implicit connection =>
    val id: Option[Long] = SQL(
      """INSERT INTO TB_FILME(TITULO, DIRETOR, ANO_PRODUCAO)
            values ({titulo}, {diretor}, {anoProducao})""")
      .on('titulo -> filme.titulo,
        'diretor -> filme.diretor,
        'anoProducao -> filme.anoProducao
      ).executeInsert()
  }

  def listar = database.withConnection { implicit connection =>
    SQL"SELECT TITULO, DIRETOR, ANO_PRODUCAO AS anoProducao, IFNULL(AVG(NOTAS), 0) AS media FROM TB_AVALIACAO RIGHT OUTER JOIN TB_FILME ON TB_AVALIACAO.FILME = TB_FILME.TITULO GROUP BY TITULO, DIRETOR, ANO_PRODUCAO".as(parserF.*)
  }

  def listarLogado(usuario: Usuario) = database.withConnection { implicit connection =>
    SQL"SELECT USUARIO, FILME, NOTAS FROM TB_AVALIACAO".as(parser *)
  }

  def avaliar(filme: String, nota: Int) : String = database.withConnection { implicit connection =>
    try{
      val id: Int = SQL(
        """INSERT INTO TB_AVALIACAO(USUARIO ,FILME ,NOTAS)
            VALUES ({usuario}, {filme}, {nota})""")
        .on('usuario -> UsuarioAtual.id,
            'filme -> filme,
            'nota -> nota
        ).executeUpdate()
       }
       catch {
        case e: NullPointerException =>  "FILME INVALIDO, TENTE NOVAMENTE"
       }

    return "FILME AVALIADO COM SUCESSO!"
  }

}