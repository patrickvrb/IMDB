package controllers

import play.api.mvc._
import models.{Filme, FilmeDAO, Nota, Usuario}
import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import javax.inject.Singleton

import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi

@Singleton
class FilmeController @Inject()(dao: FilmeDAO, val messagesApi: MessagesApi) extends Controller with I18nSupport {
  
  def listar = Action {
    var filmes = dao.listar
    Ok(views.html.filmes.listagem(filmes))
  }

  def avaliar = Action {
    var filmes = dao.listar
    Ok(views.html.filmes.avaliar(filmes, notaForm, null))
  }

  def avaliarSubmissao = Action { implicit request =>
    notaForm.bindFromRequest.fold(
      formWithErrors => {
        var filmes = dao.listar
        BadRequest(views.html.filmes.avaliar(filmes, notaForm, null))
      },
      nota =>{
      var error = dao.avaliar(nota.filme, nota.nota)
      var filmes = dao.listar
      Ok(views.html.filmes.avaliar(filmes, notaForm, error))
      }
    )
  }

  def novoFilme = Action {
    Ok(views.html.filmes.novoFilme(filmeForm))
  }
  
  def novoFilmeSubmissao = Action { implicit request =>
    filmeForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.filmes.novoFilme(formWithErrors))
      },
      filme => {
        var novoFilme = Filme(filme.titulo, filme.diretor, filme.ano)
        dao.salvar(novoFilme)
        var filmes = dao.listar
        Created(views.html.filmes.avaliar(filmes, notaForm, null))
    }
  )
    
  }

  val filmeForm = Form(
    mapping(
      "Titulo"  -> nonEmptyText,
      "Diretor" -> nonEmptyText,
      "Ano" -> number(min=1850, max=2050)
    )(FilmeVO.apply)(FilmeVO.unapply)
  )

  val notaForm = Form(
      mapping(
        "Filme" -> nonEmptyText,
        "Nota" -> number(min = 0, max = 10)
      )(NotaVO.apply)(NotaVO.unapply)
  )

}

case class FilmeVO(titulo: String, diretor: String, ano: Int)

case class NotaVO(filme : String ,nota : Int)
