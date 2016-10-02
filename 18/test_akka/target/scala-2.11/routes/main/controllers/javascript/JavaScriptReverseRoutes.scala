
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Dropbox/scala book/play code/18/test_akka/conf/routes
// @DATE:Sun Oct 02 09:57:03 KST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def comm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comm"})
        }
      """
    )
  
    // @LINE:7
    def akka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.akka",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "akka"})
        }
      """
    )
  
    // @LINE:11
    def chatStart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.chatStart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatstart"})
        }
      """
    )
  
    // @LINE:10
    def commStart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.commStart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "commstart"})
        }
      """
    )
  
    // @LINE:9
    def chat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.chat",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
