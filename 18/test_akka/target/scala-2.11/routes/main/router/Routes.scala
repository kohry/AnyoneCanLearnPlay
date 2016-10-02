
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Dropbox/scala book/play code/18/test_akka/conf/routes
// @DATE:Sun Oct 02 09:57:03 KST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """akka""", """controllers.HomeController.akka"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comm""", """controllers.HomeController.comm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chat""", """controllers.HomeController.chat"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """commstart""", """controllers.HomeController.commStart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatstart""", """controllers.HomeController.chatStart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
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
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_akka1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("akka")))
  )
  private[this] lazy val controllers_HomeController_akka1_invoker = createInvoker(
    HomeController_0.akka,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "akka",
      Nil,
      "GET",
      """""",
      this.prefix + """akka"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_comm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comm")))
  )
  private[this] lazy val controllers_HomeController_comm2_invoker = createInvoker(
    HomeController_0.comm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "comm",
      Nil,
      "GET",
      """""",
      this.prefix + """comm"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_chat3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chat")))
  )
  private[this] lazy val controllers_HomeController_chat3_invoker = createInvoker(
    HomeController_0.chat,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "chat",
      Nil,
      "GET",
      """""",
      this.prefix + """chat"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_commStart4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("commstart")))
  )
  private[this] lazy val controllers_HomeController_commStart4_invoker = createInvoker(
    HomeController_0.commStart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "commStart",
      Nil,
      "GET",
      """""",
      this.prefix + """commstart"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_chatStart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatstart")))
  )
  private[this] lazy val controllers_HomeController_chatStart5_invoker = createInvoker(
    HomeController_0.chatStart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "chatStart",
      Nil,
      "GET",
      """""",
      this.prefix + """chatstart"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
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
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_akka1_route(params) =>
      call { 
        controllers_HomeController_akka1_invoker.call(HomeController_0.akka)
      }
  
    // @LINE:8
    case controllers_HomeController_comm2_route(params) =>
      call { 
        controllers_HomeController_comm2_invoker.call(HomeController_0.comm)
      }
  
    // @LINE:9
    case controllers_HomeController_chat3_route(params) =>
      call { 
        controllers_HomeController_chat3_invoker.call(HomeController_0.chat)
      }
  
    // @LINE:10
    case controllers_HomeController_commStart4_route(params) =>
      call { 
        controllers_HomeController_commStart4_invoker.call(HomeController_0.commStart)
      }
  
    // @LINE:11
    case controllers_HomeController_chatStart5_route(params) =>
      call { 
        controllers_HomeController_chatStart5_invoker.call(HomeController_0.chatStart)
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
