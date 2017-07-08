
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/conf/routes
// @DATE:Wed Jul 05 19:47:43 BRT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def redirect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.redirect",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirect"})
        }
      """
    )
  
    // @LINE:19
    def loginUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.loginUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
        }
      """
    )
  
    // @LINE:16
    def novoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.novoUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:17
    def novoUsuarioSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.novoUsuarioSubmissao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
        }
      """
    )
  
    // @LINE:20
    def loginUsuarioSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.loginUsuarioSubmissao",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/logado"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseFilmeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def novoFilme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.novoFilme",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/novo"})
        }
      """
    )
  
    // @LINE:13
    def avaliar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.avaliar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/avaliar"})
        }
      """
    )
  
    // @LINE:14
    def avaliarSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.avaliarSubmissao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/avaliar"})
        }
      """
    )
  
    // @LINE:10
    def listar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.listar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme"})
        }
      """
    )
  
    // @LINE:12
    def novoFilmeSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.novoFilmeSubmissao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme"})
        }
      """
    )
  
  }


}
