
package views.html.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novoUsuario_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class novoUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[UsuarioVO],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* novoUsuario Template File */
  def apply/*2.2*/(usuarioForm: Form[UsuarioVO])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.61*/("""

"""),_display_(/*4.2*/main("Novo usuario")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""


"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.UsuarioController.novoUsuarioSubmissao())/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""
"""),_display_(/*8.2*/helper/*8.8*/.inputText(usuarioForm("Email"))),format.raw/*8.40*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(usuarioForm("Senha"), 'type -> "password")),format.raw/*9.61*/("""

"""),format.raw/*11.1*/("""<div class="form-actions">
    <button type="submit">CADASTRAR USUARIO</button>
</div>

<p> <button> <a href="/">RETORNAR</a></button></p>

 """)))}),format.raw/*17.3*/("""

""")))}),format.raw/*19.2*/("""

"""))
      }
    }
  }

  def render(usuarioForm:Form[UsuarioVO],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm)(messages)

  def f:((Form[UsuarioVO]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm) => (messages) => apply(usuarioForm)(messages)

  def ref: this.type = this

}


}

/* novoUsuario Template File */
object novoUsuario extends novoUsuario_Scope0.novoUsuario
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 11:16:48 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/usuarios/novoUsuario.scala.html
                  HASH: 1c81c85f4f02c21251974e18e80591f088b9c62b
                  MATRIX: 593->33|747->92|775->95|803->115|842->117|871->121|884->127|955->190|994->192|1021->194|1034->200|1086->232|1113->234|1126->240|1199->293|1228->295|1400->437|1433->440
                  LINES: 20->2|25->2|27->4|27->4|27->4|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|34->11|40->17|42->19
                  -- GENERATED --
              */
          