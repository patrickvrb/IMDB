
package views.html.filmes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object avaliar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class avaliar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[FilmeMedia],Form[NotaVO],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* listagem Template File */
  def apply/*2.2*/(filmes: List[FilmeMedia], notaForm: Form[NotaVO], error : String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.97*/("""

"""),_display_(/*4.2*/main("IMDB")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""

"""),format.raw/*6.1*/("""<link rel="stylesheet" type="text/css" href='"""),_display_(/*6.47*/routes/*6.53*/.Assets.versioned("/bootstrap-3.3.7-dist/css/bootstrap.css")),format.raw/*6.113*/("""'/>

"""),_display_(/*8.2*/helper/*8.8*/.form(action = routes.FilmeController.avaliarSubmissao())/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""
"""),format.raw/*9.1*/("""<html>
<body>
<table class="table table-striped">
    <tr>
        <th>TITULO</th>
        <th>DIRETOR</th>
        <th>ANO DE PRODUCAO</th>
        <th>NOTA MEDIA</th>
    </tr>
    """),_display_(/*18.6*/for(filme <- filmes) yield /*18.26*/ {_display_(Seq[Any](format.raw/*18.28*/("""
    """),format.raw/*19.5*/("""<tr><td>"""),_display_(/*19.14*/filme/*19.19*/.titulo),format.raw/*19.26*/("""</td> - <td>"""),_display_(/*19.39*/filme/*19.44*/.diretor),format.raw/*19.52*/("""</td> - <td>"""),_display_(/*19.65*/filme/*19.70*/.anoProducao),format.raw/*19.82*/("""</td> - <td>"""),_display_(/*19.95*/filme/*19.100*/.media),format.raw/*19.106*/(""" """),format.raw/*19.107*/("""</td></tr>
    """)))}),format.raw/*20.6*/("""

"""),format.raw/*22.1*/("""</table>

"""),_display_(/*24.2*/helper/*24.8*/.inputText(notaForm("Filme"))),format.raw/*24.37*/("""
"""),_display_(/*25.2*/helper/*25.8*/.inputText(notaForm("Nota"))),format.raw/*25.36*/("""

"""),format.raw/*27.1*/("""<div class="form-actions">
    <button type="submit">SUBMETER AVALIACAO</button>
</div>
<button><a href = "/redirect"> RETORNAR </a></button>
</body>
</html>

""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(filmes:List[FilmeMedia],notaForm:Form[NotaVO],error:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(filmes,notaForm,error)(messages)

  def f:((List[FilmeMedia],Form[NotaVO],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (filmes,notaForm,error) => (messages) => apply(filmes,notaForm,error)(messages)

  def ref: this.type = this

}


}

/* listagem Template File */
object avaliar extends avaliar_Scope0.avaliar
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 11:53:29 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/filmes/avaliar.scala.html
                  HASH: 018afc7cc81dd249032cfe2d9e70813093c1ed13
                  MATRIX: 601->30|791->125|819->128|839->140|878->142|906->144|978->190|992->196|1073->256|1104->262|1117->268|1182->325|1221->327|1248->328|1458->512|1494->532|1534->534|1566->539|1602->548|1616->553|1644->560|1684->573|1698->578|1727->586|1767->599|1781->604|1814->616|1854->629|1869->634|1897->640|1927->641|1973->657|2002->659|2039->670|2053->676|2103->705|2131->707|2145->713|2194->741|2223->743|2413->903
                  LINES: 20->2|25->2|27->4|27->4|27->4|29->6|29->6|29->6|29->6|31->8|31->8|31->8|31->8|32->9|41->18|41->18|41->18|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|43->20|45->22|47->24|47->24|47->24|48->25|48->25|48->25|50->27|57->34
                  -- GENERATED --
              */
          