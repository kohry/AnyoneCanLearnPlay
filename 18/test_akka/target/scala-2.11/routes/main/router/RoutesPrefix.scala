
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Dropbox/scala book/play code/18/test_akka/conf/routes
// @DATE:Sun Oct 02 09:57:03 KST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
