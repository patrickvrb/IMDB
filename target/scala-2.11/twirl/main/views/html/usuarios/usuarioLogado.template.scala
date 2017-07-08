
package views.html.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarioLogado_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class usuarioLogado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* listagem Template File */
  def apply/*2.2*/(usuario : String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.49*/("""

"""),_display_(/*4.2*/main("IMDB")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
"""),format.raw/*5.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IMDb</title>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*9.51*/routes/*9.57*/.Assets.versioned("/bootstrap-3.3.7-dist/css/bootstrap.css")),format.raw/*9.117*/("""'/>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">IMDb</a>
            <a class="navbar-brand">BEM VINDO, """),_display_(/*24.49*/UsuarioAtual/*24.61*/.usuario),format.raw/*24.69*/("""!</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href = "/filme/avaliar">AVALIAR FILMES<span class="sr-only">(current)</span></a></li>
                <li class="active"><a href = "/filme/novo"> CADASTRAR NOVO FILME <span class="sr-only">(current)</span></a></li>
                <li class="active"><a href="/">SAIR<span class="sr-only">(current)</span></a></li>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

</body>
</html>


""")))}),format.raw/*43.2*/("""


"""))
      }
    }
  }

  def render(usuario:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(usuario)(messages)

  def f:((String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => (messages) => apply(usuario)(messages)

  def ref: this.type = this

}


}

/* listagem Template File */
object usuarioLogado extends usuarioLogado_Scope0.usuarioLogado
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 11:39:34 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/usuarios/usuarioLogado.scala.html
                  HASH: eb3503ad255767eda3db3b936ba0dd72fd8d3dc2
                  MATRIX: 585->30|727->77|755->80|775->92|814->94|841->95|992->220|1006->226|1087->286|1796->968|1817->980|1846->988|2573->1685
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|32->9|32->9|32->9|47->24|47->24|47->24|66->43
                  -- GENERATED --
              */
          