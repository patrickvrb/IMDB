package controllers

import models.{Usuario, UsuarioDAO}
import javax.inject.Inject
import play.api.data._
import play.api.data.Forms._
import javax.inject.Singleton
import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi
import play.api.mvc._


@Singleton
class UsuarioController @Inject()(dao: UsuarioDAO, val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def loginUsuario = Action{
    Ok(views.html.usuarios.loginUsuario(usuarioForm, null))
  }

  def loginUsuarioSubmissao = Action { implicit request =>
    usuarioForm.bindFromRequest.fold(
      formWithErrors =>{
        BadRequest(views.html.usuarios.loginUsuario(formWithErrors, null))
      },
      usuario => {
        var user = Usuario(0, usuario.email, usuario.senha)
        var error = dao.logar(user)
        if(error == usuario.email)
          Ok(views.html.usuarios.usuarioLogado(usuario.email))
        else
          Ok(views.html.usuarios.loginUsuario(usuarioForm, error))
      }
    )
  }

  def redirect = Action {
    Ok(views.html.usuarios.usuarioLogado(UsuarioAtual.usuario))
  }

  def novoUsuario = Action {
    Ok(views.html.usuarios.novoUsuario(usuarioForm))
  }

  def novoUsuarioSubmissao = Action { implicit request =>
    usuarioForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.usuarios.novoUsuario(formWithErrors))
      },
      usuario => {
        val novoUsuario = Usuario(0, usuario.email, usuario.senha)
        var error = dao.salvar(novoUsuario)
        Created(views.html.usuarios.loginUsuario(usuarioForm, error))
      }
    )

  }

  val usuarioForm = Form(
    mapping(
      "Email" -> nonEmptyText,
      "Senha" -> nonEmptyText
    )(UsuarioVO.apply)(UsuarioVO.unapply)
  )
}

case class UsuarioVO(email: String, senha: String)