
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sat Oct 22 14:50:30 PDT 2016


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