
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/minute.tech/conf/routes
// @DATE:Sat Dec 03 16:53:56 PST 2016


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
