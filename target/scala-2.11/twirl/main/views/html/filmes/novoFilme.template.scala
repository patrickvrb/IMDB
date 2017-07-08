
package views.html.filmes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novoFilme_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class novoFilme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[FilmeVO],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* novoFilme Template File */
  def apply/*2.2*/(filmeForm: Form[FilmeVO])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),_display_(/*4.2*/main("Novo filme")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),_display_(/*5.4*/helper/*5.10*/.form(action = routes.FilmeController.novoFilmeSubmissao())/*5.69*/ {_display_(Seq[Any](format.raw/*5.71*/("""
  """),_display_(/*6.4*/helper/*6.10*/.inputText(filmeForm("Titulo"))),format.raw/*6.41*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(filmeForm("Diretor"))),format.raw/*7.42*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputText(filmeForm("Ano"))),format.raw/*8.38*/("""

  """),format.raw/*10.3*/("""<div class="form-actions">
    <button type="submit">CADASTRAR FILME</button>
  </div>

<button><a href = "/redirect"> RETORNAR </a></button>
 """)))}),format.raw/*15.3*/("""
""")))}))
      }
    }
  }

  def render(filmeForm:Form[FilmeVO],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(filmeForm)(messages)

  def f:((Form[FilmeVO]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (filmeForm) => (messages) => apply(filmeForm)(messages)

  def ref: this.type = this

}


}

/* novoFilme Template File */
object novoFilme extends novoFilme_Scope0.novoFilme
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 02:35:44 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/filmes/novoFilme.scala.html
                  HASH: a3aaf1b726da9a8890ed139450e77782ce1277b4
                  MATRIX: 583->31|733->86|761->89|787->107|826->109|855->113|869->119|936->178|975->180|1004->184|1018->190|1069->221|1098->225|1112->231|1164->263|1193->267|1207->273|1255->301|1286->305|1460->449
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|31->8|31->8|31->8|33->10|38->15
                  -- GENERATED --
              */
          