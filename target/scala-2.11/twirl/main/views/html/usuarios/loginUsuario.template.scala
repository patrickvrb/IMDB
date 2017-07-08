
package views.html.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginUsuario_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class loginUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[UsuarioVO],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* novoUsuario Template File */
  def apply/*2.2*/(usuarioForm: Form[UsuarioVO], error : String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.77*/("""

"""),_display_(/*4.2*/main("Logar usuario")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""

"""),_display_(/*6.2*/if(error!= null)/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""<p>"""),_display_(/*6.24*/error),format.raw/*6.29*/("""</p>""")))}),format.raw/*6.34*/("""

"""),_display_(/*8.2*/helper/*8.8*/.form(action = routes.UsuarioController.loginUsuarioSubmissao())/*8.72*/ {_display_(Seq[Any](format.raw/*8.74*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(usuarioForm("Email"))),format.raw/*9.40*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputText(usuarioForm("Senha"), 'type -> "password")),format.raw/*10.61*/("""


"""),format.raw/*13.1*/("""<p>  <div class="form-actions">
    <button type="submit">LOGIN</button>
</div>

<button><a href = "/">RETORNAR</a></button>

""")))}),format.raw/*19.2*/("""

""")))}))
      }
    }
  }

  def render(usuarioForm:Form[UsuarioVO],error:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm,error)(messages)

  def f:((Form[UsuarioVO],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm,error) => (messages) => apply(usuarioForm,error)(messages)

  def ref: this.type = this

}


}

/* novoUsuario Template File */
object loginUsuario extends loginUsuario_Scope0.loginUsuario
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 02:35:44 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/usuarios/loginUsuario.scala.html
                  HASH: 8e23ab25588b053e076b4d876c33f5b434bdf345
                  MATRIX: 602->33|772->108|800->111|829->132|868->134|896->137|920->153|959->155|989->159|1014->164|1049->169|1077->172|1090->178|1162->242|1201->244|1228->246|1241->252|1293->284|1321->286|1335->292|1409->345|1439->348|1596->475
                  LINES: 20->2|25->2|27->4|27->4|27->4|29->6|29->6|29->6|29->6|29->6|29->6|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|36->13|42->19
                  -- GENERATED --
              */
          