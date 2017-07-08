
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("IMDb")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

"""),format.raw/*5.1*/("""<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>IMDB</title>
  <link rel="stylesheet" type="text/css" href='"""),_display_(/*9.49*/routes/*9.55*/.Assets.versioned("/bootstrap-3.3.7-dist/css/bootstrap.css")),format.raw/*9.115*/("""'/>
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
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href = "/usuario"> LOGIN <span class="sr-only">(current)</span></a></li>
        <li class="active"><a href = "/usuario/novo"> CRIAR CONTA <span class="sr-only">(current)</span></a></li>
        <li class="active"><a href = "/filme"> LISTAR FILMES <span class="sr-only">(current)</span></a></li>

      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

</body>
</html>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 01:04:16 BRT 2017
                  SOURCE: /Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/app/views/index.scala.html
                  HASH: 6d7920bcd4533bc234c75ef59841a60e0bbb3140
                  MATRIX: 520->1|616->3|644->6|664->18|703->20|731->22|876->141|890->147|971->207
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|33->9|33->9|33->9
                  -- GENERATED --
              */
          