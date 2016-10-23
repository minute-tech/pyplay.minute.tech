
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sun Oct 23 10:48:34 PDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:19
  class ReverseTechnicianController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def getTechnicians: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnicianController.getTechnicians",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians"})
        }
      """
    )
  
    // @LINE:19
    def addTechnician: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnicianController.addTechnician",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technician"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseSupportRequestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getSupportRequests: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SupportRequestController.getSupportRequests",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "supportRequests"})
        }
      """
    )
  
    // @LINE:22
    def addSupportRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SupportRequestController.addSupportRequest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "supportRequest"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseDashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
  }


}
