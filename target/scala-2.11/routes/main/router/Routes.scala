
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/conf/routes
// @DATE:Wed Jul 05 19:47:43 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_0: controllers.HomeController,
  // @LINE:10
  FilmeController_2: controllers.FilmeController,
  // @LINE:16
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_0: controllers.HomeController,
    // @LINE:10
    FilmeController_2: controllers.FilmeController,
    // @LINE:16
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:25
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, FilmeController_2, UsuarioController_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, FilmeController_2, UsuarioController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme""", """controllers.FilmeController.listar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/novo""", """controllers.FilmeController.novoFilme"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme""", """controllers.FilmeController.novoFilmeSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/avaliar""", """controllers.FilmeController.avaliar"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/avaliar""", """controllers.FilmeController.avaliarSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.novoUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.UsuarioController.novoUsuarioSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.UsuarioController.loginUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/logado""", """controllers.UsuarioController.loginUsuarioSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """redirect""", """controllers.UsuarioController.redirect"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_FilmeController_listar1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme")))
  )
  private[this] lazy val controllers_FilmeController_listar1_invoker = createInvoker(
    FilmeController_2.listar,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "listar",
      Nil,
      "GET",
      """""",
      this.prefix + """filme"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FilmeController_novoFilme2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/novo")))
  )
  private[this] lazy val controllers_FilmeController_novoFilme2_invoker = createInvoker(
    FilmeController_2.novoFilme,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "novoFilme",
      Nil,
      "GET",
      """""",
      this.prefix + """filme/novo"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_FilmeController_novoFilmeSubmissao3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme")))
  )
  private[this] lazy val controllers_FilmeController_novoFilmeSubmissao3_invoker = createInvoker(
    FilmeController_2.novoFilmeSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "novoFilmeSubmissao",
      Nil,
      "POST",
      """""",
      this.prefix + """filme"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FilmeController_avaliar4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/avaliar")))
  )
  private[this] lazy val controllers_FilmeController_avaliar4_invoker = createInvoker(
    FilmeController_2.avaliar,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "avaliar",
      Nil,
      "GET",
      """""",
      this.prefix + """filme/avaliar"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_FilmeController_avaliarSubmissao5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/avaliar")))
  )
  private[this] lazy val controllers_FilmeController_avaliarSubmissao5_invoker = createInvoker(
    FilmeController_2.avaliarSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "avaliarSubmissao",
      Nil,
      "POST",
      """""",
      this.prefix + """filme/avaliar"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UsuarioController_novoUsuario6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_novoUsuario6_invoker = createInvoker(
    UsuarioController_3.novoUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "novoUsuario",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/novo"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UsuarioController_novoUsuarioSubmissao7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_UsuarioController_novoUsuarioSubmissao7_invoker = createInvoker(
    UsuarioController_3.novoUsuarioSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "novoUsuarioSubmissao",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UsuarioController_loginUsuario8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_UsuarioController_loginUsuario8_invoker = createInvoker(
    UsuarioController_3.loginUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "loginUsuario",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_loginUsuarioSubmissao9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/logado")))
  )
  private[this] lazy val controllers_UsuarioController_loginUsuarioSubmissao9_invoker = createInvoker(
    UsuarioController_3.loginUsuarioSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "loginUsuarioSubmissao",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/logado"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UsuarioController_redirect10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redirect")))
  )
  private[this] lazy val controllers_UsuarioController_redirect10_invoker = createInvoker(
    UsuarioController_3.redirect,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "redirect",
      Nil,
      "GET",
      """""",
      this.prefix + """redirect"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:10
    case controllers_FilmeController_listar1_route(params) =>
      call { 
        controllers_FilmeController_listar1_invoker.call(FilmeController_2.listar)
      }
  
    // @LINE:11
    case controllers_FilmeController_novoFilme2_route(params) =>
      call { 
        controllers_FilmeController_novoFilme2_invoker.call(FilmeController_2.novoFilme)
      }
  
    // @LINE:12
    case controllers_FilmeController_novoFilmeSubmissao3_route(params) =>
      call { 
        controllers_FilmeController_novoFilmeSubmissao3_invoker.call(FilmeController_2.novoFilmeSubmissao)
      }
  
    // @LINE:13
    case controllers_FilmeController_avaliar4_route(params) =>
      call { 
        controllers_FilmeController_avaliar4_invoker.call(FilmeController_2.avaliar)
      }
  
    // @LINE:14
    case controllers_FilmeController_avaliarSubmissao5_route(params) =>
      call { 
        controllers_FilmeController_avaliarSubmissao5_invoker.call(FilmeController_2.avaliarSubmissao)
      }
  
    // @LINE:16
    case controllers_UsuarioController_novoUsuario6_route(params) =>
      call { 
        controllers_UsuarioController_novoUsuario6_invoker.call(UsuarioController_3.novoUsuario)
      }
  
    // @LINE:17
    case controllers_UsuarioController_novoUsuarioSubmissao7_route(params) =>
      call { 
        controllers_UsuarioController_novoUsuarioSubmissao7_invoker.call(UsuarioController_3.novoUsuarioSubmissao)
      }
  
    // @LINE:19
    case controllers_UsuarioController_loginUsuario8_route(params) =>
      call { 
        controllers_UsuarioController_loginUsuario8_invoker.call(UsuarioController_3.loginUsuario)
      }
  
    // @LINE:20
    case controllers_UsuarioController_loginUsuarioSubmissao9_route(params) =>
      call { 
        controllers_UsuarioController_loginUsuarioSubmissao9_invoker.call(UsuarioController_3.loginUsuarioSubmissao)
      }
  
    // @LINE:22
    case controllers_UsuarioController_redirect10_route(params) =>
      call { 
        controllers_UsuarioController_redirect10_invoker.call(UsuarioController_3.redirect)
      }
  
    // @LINE:25
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
