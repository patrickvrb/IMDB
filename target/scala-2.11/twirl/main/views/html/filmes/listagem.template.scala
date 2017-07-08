
package views.html.filmes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listagem_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class listagem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[FilmeMedia],play.twirl.api.HtmlFormat.Appendable] {

  /* listagem Template File */
  def apply/*2.2*/(filmes: List[FilmeMedia]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.28*/("""

"""),_display_(/*4.2*/main("IMDB")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
"""),format.raw/*5.1*/("""<html lang="en">
<link rel="stylesheet" type="text/css" href='"""),_display_(/*6.47*/routes/*6.53*/.Assets.versioned("/bootstrap-3.3.7-dist/css/bootstrap.css")),format.raw/*6.113*/("""'/>

<tbody>
<table class="table table-striped">
    <tr>
        <th>TITULO</th>
        <th>DIRETOR</th>
        <th>ANO DE PRODUCAO</th>
        <th>NOTA MEDIA</th>
    </tr>
     """),_display_(/*16.7*/for(filme <- filmes) yield /*16.27*/ {_display_(Seq[Any](format.raw/*16.29*/("""
    """),format.raw/*17.5*/("""<tr><td>"""),_display_(/*17.14*/filme/*17.19*/.titulo),format.raw/*17.26*/("""</td> - <td>"""),_display_(/*17.39*/filme/*17.44*/.diretor),format.raw/*17.52*/("""</td> - <td>"""),_display_(/*17.65*/filme/*17.70*/.anoProducao),format.raw/*17.82*/("""</td> - <td>"""),_display_(/*17.95*/filme/*17.100*/.media),format.raw/*17.106*/(""" """),format.raw/*17.107*/("""</td></tr>
     """)))}),format.raw/*18.7*/("""

"""),format.raw/*20.1*/("""</table>

    <button>
        <a href = "/"> RETORNAR</a>
    </button>

</tbody>
</html>
""")))}))
      }
    }
  }

  def render(filmes:List[FilmeMedia]): play.twirl.api.HtmlFormat.Appendable = apply(filmes)

  def f:((List[FilmeMedia]) => play.twirl.api.HtmlFormat.Appendable) = (filmes) => apply(filmes)

  def ref: this.type = this

}


}

/* listagem Template File */
object listagem extends listagem_Scope0.listagem
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 11:51:40 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/filmes/listagem.scala.html
                  HASH: ac48b74682b2ca3a291f0370236fce91104bd594
                  MATRIX: 574->30|695->56|723->59|743->71|782->73|809->74|898->137|912->143|993->203|1203->387|1239->407|1279->409|1311->414|1347->423|1361->428|1389->435|1429->448|1443->453|1472->461|1512->474|1526->479|1559->491|1599->504|1614->509|1642->515|1672->516|1719->533|1748->535
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|29->6|29->6|29->6|39->16|39->16|39->16|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|41->18|43->20
                  -- GENERATED --
              */
          