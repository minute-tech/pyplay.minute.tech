
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sun Oct 23 16:24:21 PDT 2016

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
  Application_8: controllers.Application,
  // @LINE:7
  Dashboard_3: controllers.Dashboard,
  // @LINE:12
  Index_9: controllers.account.settings.Index,
  // @LINE:13
  Password_2: controllers.account.settings.Password,
  // @LINE:15
  Email_4: controllers.account.settings.Email,
  // @LINE:19
  TechnicianController_6: controllers.TechnicianController,
  // @LINE:22
  SupportRequestController_1: controllers.SupportRequestController,
  // @LINE:30
  Signup_7: controllers.account.Signup,
  // @LINE:37
  Reset_0: controllers.account.Reset,
  // @LINE:47
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_8: controllers.Application,
    // @LINE:7
    Dashboard_3: controllers.Dashboard,
    // @LINE:12
    Index_9: controllers.account.settings.Index,
    // @LINE:13
    Password_2: controllers.account.settings.Password,
    // @LINE:15
    Email_4: controllers.account.settings.Email,
    // @LINE:19
    TechnicianController_6: controllers.TechnicianController,
    // @LINE:22
    SupportRequestController_1: controllers.SupportRequestController,
    // @LINE:30
    Signup_7: controllers.account.Signup,
    // @LINE:37
    Reset_0: controllers.account.Reset,
    // @LINE:47
    Assets_5: controllers.Assets
  ) = this(errorHandler, Application_8, Dashboard_3, Index_9, Password_2, Email_4, TechnicianController_6, SupportRequestController_1, Signup_7, Reset_0, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_8, Dashboard_3, Index_9, Password_2, Email_4, TechnicianController_6, SupportRequestController_1, Signup_7, Reset_0, Assets_5, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supportRequest""", """controllers.SupportRequestController.addSupportRequest()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supportRequests""", """controllers.SupportRequestController.getSupportRequests()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """supportRequest/new""", """controllers.SupportRequestController.create()"""),
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
    Application_8.index(),
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
    Dashboard_3.index(),
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
    Application_8.authenticate(),
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
    Application_8.logout(),
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
    Index_9.index(),
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
    Password_2.index(),
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
    Password_2.runPassword(),
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
    Email_4.index(),
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
    Email_4.runEmail(),
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
    TechnicianController_6.addTechnician(),
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
    TechnicianController_6.getTechnicians(),
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

  // @LINE:22
  private[this] lazy val controllers_SupportRequestController_addSupportRequest11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supportRequest")))
  )
  private[this] lazy val controllers_SupportRequestController_addSupportRequest11_invoker = createInvoker(
    SupportRequestController_1.addSupportRequest(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SupportRequestController",
      "addSupportRequest",
      Nil,
      "POST",
      """""",
      this.prefix + """supportRequest"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_SupportRequestController_getSupportRequests12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supportRequests")))
  )
  private[this] lazy val controllers_SupportRequestController_getSupportRequests12_invoker = createInvoker(
    SupportRequestController_1.getSupportRequests(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SupportRequestController",
      "getSupportRequests",
      Nil,
      "GET",
      """""",
      this.prefix + """supportRequests"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SupportRequestController_create13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("supportRequest/new")))
  )
  private[this] lazy val controllers_SupportRequestController_create13_invoker = createInvoker(
    SupportRequestController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SupportRequestController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """supportRequest/new"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_account_Signup_create14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create14_invoker = createInvoker(
    Signup_7.create(),
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

  // @LINE:31
  private[this] lazy val controllers_account_Signup_save15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save15_invoker = createInvoker(
    Signup_7.save(),
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

  // @LINE:34
  private[this] lazy val controllers_account_Signup_confirm16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm16_invoker = createInvoker(
    Signup_7.confirm(fakeValue[String]),
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

  // @LINE:37
  private[this] lazy val controllers_account_Reset_ask17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask17_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_account_Reset_runAsk18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk18_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_account_Reset_reset19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset19_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_account_Reset_runReset20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset20_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_account_settings_Email_validateEmail21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail21_invoker = createInvoker(
    Email_4.validateEmail(fakeValue[String]),
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

  // @LINE:47
  private[this] lazy val controllers_Assets_at22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at22_invoker = createInvoker(
    Assets_5.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_index0_invoker.call(Application_8.index())
      }
  
    // @LINE:7
    case controllers_Dashboard_index1_route(params) =>
      call { 
        controllers_Dashboard_index1_invoker.call(Dashboard_3.index())
      }
  
    // @LINE:9
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(Application_8.authenticate())
      }
  
    // @LINE:10
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_8.logout())
      }
  
    // @LINE:12
    case controllers_account_settings_Index_index4_route(params) =>
      call { 
        controllers_account_settings_Index_index4_invoker.call(Index_9.index())
      }
  
    // @LINE:13
    case controllers_account_settings_Password_index5_route(params) =>
      call { 
        controllers_account_settings_Password_index5_invoker.call(Password_2.index())
      }
  
    // @LINE:14
    case controllers_account_settings_Password_runPassword6_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword6_invoker.call(Password_2.runPassword())
      }
  
    // @LINE:15
    case controllers_account_settings_Email_index7_route(params) =>
      call { 
        controllers_account_settings_Email_index7_invoker.call(Email_4.index())
      }
  
    // @LINE:16
    case controllers_account_settings_Email_runEmail8_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail8_invoker.call(Email_4.runEmail())
      }
  
    // @LINE:19
    case controllers_TechnicianController_addTechnician9_route(params) =>
      call { 
        controllers_TechnicianController_addTechnician9_invoker.call(TechnicianController_6.addTechnician())
      }
  
    // @LINE:20
    case controllers_TechnicianController_getTechnicians10_route(params) =>
      call { 
        controllers_TechnicianController_getTechnicians10_invoker.call(TechnicianController_6.getTechnicians())
      }
  
    // @LINE:22
    case controllers_SupportRequestController_addSupportRequest11_route(params) =>
      call { 
        controllers_SupportRequestController_addSupportRequest11_invoker.call(SupportRequestController_1.addSupportRequest())
      }
  
    // @LINE:23
    case controllers_SupportRequestController_getSupportRequests12_route(params) =>
      call { 
        controllers_SupportRequestController_getSupportRequests12_invoker.call(SupportRequestController_1.getSupportRequests())
      }
  
    // @LINE:25
    case controllers_SupportRequestController_create13_route(params) =>
      call { 
        controllers_SupportRequestController_create13_invoker.call(SupportRequestController_1.create())
      }
  
    // @LINE:30
    case controllers_account_Signup_create14_route(params) =>
      call { 
        controllers_account_Signup_create14_invoker.call(Signup_7.create())
      }
  
    // @LINE:31
    case controllers_account_Signup_save15_route(params) =>
      call { 
        controllers_account_Signup_save15_invoker.call(Signup_7.save())
      }
  
    // @LINE:34
    case controllers_account_Signup_confirm16_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm16_invoker.call(Signup_7.confirm(confirmToken))
      }
  
    // @LINE:37
    case controllers_account_Reset_ask17_route(params) =>
      call { 
        controllers_account_Reset_ask17_invoker.call(Reset_0.ask())
      }
  
    // @LINE:38
    case controllers_account_Reset_runAsk18_route(params) =>
      call { 
        controllers_account_Reset_runAsk18_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:41
    case controllers_account_Reset_reset19_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset19_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:42
    case controllers_account_Reset_runReset20_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset20_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:44
    case controllers_account_settings_Email_validateEmail21_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail21_invoker.call(Email_4.validateEmail(token))
      }
  
    // @LINE:47
    case controllers_Assets_at22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at22_invoker.call(Assets_5.at(path, file))
      }
  }
}
