
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sat Oct 22 17:09:43 PDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_7: controllers.Application,
  // @LINE:7
  Dashboard_2: controllers.Dashboard,
  // @LINE:12
  Index_8: controllers.account.settings.Index,
  // @LINE:13
  Password_1: controllers.account.settings.Password,
  // @LINE:15
  Email_3: controllers.account.settings.Email,
  // @LINE:19
  TechnicianController_5: controllers.TechnicianController,
  // @LINE:25
  Signup_6: controllers.account.Signup,
  // @LINE:32
  Reset_0: controllers.account.Reset,
  // @LINE:42
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_7: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:12
    Index_8: controllers.account.settings.Index,
    // @LINE:13
    Password_1: controllers.account.settings.Password,
    // @LINE:15
    Email_3: controllers.account.settings.Email,
    // @LINE:19
    TechnicianController_5: controllers.TechnicianController,
    // @LINE:25
    Signup_6: controllers.account.Signup,
    // @LINE:32
    Reset_0: controllers.account.Reset,
    // @LINE:42
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_7, Dashboard_2, Index_8, Password_1, Email_3, TechnicianController_5, Signup_6, Reset_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_7, Dashboard_2, Index_8, Password_1, Email_3, TechnicianController_5, Signup_6, Reset_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.account.settings.Index.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.runEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technician""", """controllers.TechnicianController.addTechnician()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians""", """controllers.TechnicianController.getTechnicians()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/""" + "$" + """confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.ask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.runAsk()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/""" + "$" + """token<[^/]+>""", """controllers.account.Reset.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/""" + "$" + """token<[^/]+>""", """controllers.account.Reset.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email/""" + "$" + """token<[^/]+>""", """controllers.account.settings.Email.validateEmail(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Dashboard_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_index1_invoker = createInvoker(
    Dashboard_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    Application_7.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_7.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_account_settings_Index_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index4_invoker = createInvoker(
    Index_8.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_account_settings_Password_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index5_invoker = createInvoker(
    Password_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_account_settings_Password_runPassword6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword6_invoker = createInvoker(
    Password_1.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "runPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_account_settings_Email_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index7_invoker = createInvoker(
    Email_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_account_settings_Email_runEmail8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail8_invoker = createInvoker(
    Email_3.runEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "runEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TechnicianController_addTechnician9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technician")))
  )
  private[this] lazy val controllers_TechnicianController_addTechnician9_invoker = createInvoker(
    TechnicianController_5.addTechnician(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnicianController",
      "addTechnician",
      Nil,
      "POST",
      """ ==ADDED==:""",
      this.prefix + """technician"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TechnicianController_getTechnicians10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians")))
  )
  private[this] lazy val controllers_TechnicianController_getTechnicians10_invoker = createInvoker(
    TechnicianController_5.getTechnicians(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnicianController",
      "getTechnicians",
      Nil,
      "GET",
      """""",
      this.prefix + """technicians"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_account_Signup_create11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create11_invoker = createInvoker(
    Signup_6.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_account_Signup_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save12_invoker = createInvoker(
    Signup_6.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_account_Signup_confirm13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm13_invoker = createInvoker(
    Signup_6.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """ Accessed when the user confirms the registration.""",
      this.prefix + """confirm/""" + "$" + """confirmToken<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_account_Reset_ask14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask14_invoker = createInvoker(
    Reset_0.ask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "ask",
      Nil,
      "GET",
      """ Displays a page to send a reset email given the user's email.""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_account_Reset_runAsk15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk15_invoker = createInvoker(
    Reset_0.runAsk(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runAsk",
      Nil,
      "POST",
      """""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_account_Reset_reset16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset16_invoker = createInvoker(
    Reset_0.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Resets the password using the password.""",
      this.prefix + """reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_account_Reset_runReset17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset17_invoker = createInvoker(
    Reset_0.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_account_settings_Email_validateEmail18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail18_invoker = createInvoker(
    Email_3.validateEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "validateEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """email/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_7.index())
      }
  
    // @LINE:7
    case controllers_Dashboard_index1_route(params) =>
      call { 
        controllers_Dashboard_index1_invoker.call(Dashboard_2.index())
      }
  
    // @LINE:9
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(Application_7.authenticate())
      }
  
    // @LINE:10
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_7.logout())
      }
  
    // @LINE:12
    case controllers_account_settings_Index_index4_route(params) =>
      call { 
        controllers_account_settings_Index_index4_invoker.call(Index_8.index())
      }
  
    // @LINE:13
    case controllers_account_settings_Password_index5_route(params) =>
      call { 
        controllers_account_settings_Password_index5_invoker.call(Password_1.index())
      }
  
    // @LINE:14
    case controllers_account_settings_Password_runPassword6_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword6_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:15
    case controllers_account_settings_Email_index7_route(params) =>
      call { 
        controllers_account_settings_Email_index7_invoker.call(Email_3.index())
      }
  
    // @LINE:16
    case controllers_account_settings_Email_runEmail8_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail8_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:19
    case controllers_TechnicianController_addTechnician9_route(params) =>
      call { 
        controllers_TechnicianController_addTechnician9_invoker.call(TechnicianController_5.addTechnician())
      }
  
    // @LINE:20
    case controllers_TechnicianController_getTechnicians10_route(params) =>
      call { 
        controllers_TechnicianController_getTechnicians10_invoker.call(TechnicianController_5.getTechnicians())
      }
  
    // @LINE:25
    case controllers_account_Signup_create11_route(params) =>
      call { 
        controllers_account_Signup_create11_invoker.call(Signup_6.create())
      }
  
    // @LINE:26
    case controllers_account_Signup_save12_route(params) =>
      call { 
        controllers_account_Signup_save12_invoker.call(Signup_6.save())
      }
  
    // @LINE:29
    case controllers_account_Signup_confirm13_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm13_invoker.call(Signup_6.confirm(confirmToken))
      }
  
    // @LINE:32
    case controllers_account_Reset_ask14_route(params) =>
      call { 
        controllers_account_Reset_ask14_invoker.call(Reset_0.ask())
      }
  
    // @LINE:33
    case controllers_account_Reset_runAsk15_route(params) =>
      call { 
        controllers_account_Reset_runAsk15_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:36
    case controllers_account_Reset_reset16_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset16_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:37
    case controllers_account_Reset_runReset17_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset17_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:39
    case controllers_account_settings_Email_validateEmail18_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail18_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:42
    case controllers_Assets_at19_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_4.at(path, file))
      }
  }
}
