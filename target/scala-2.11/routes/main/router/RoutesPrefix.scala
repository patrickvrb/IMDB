
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/patrickbeal/Documents/UnB/TP1/IMDB/lightIMDB-master/conf/routes
// @DATE:Wed Jul 05 19:47:43 BRT 2017


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
