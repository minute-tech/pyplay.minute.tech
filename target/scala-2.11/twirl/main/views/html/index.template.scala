
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""

  """),_display_(/*9.4*/wflash()),format.raw/*9.12*/("""
  """),format.raw/*10.3*/("""<div class="col-lg-6">
      ...Page Info....
    </div>
    
    <!--test form for technicians; to be moved; TODO: -->
  <h4>Technicians</h4>
  <form action=""""),_display_(/*16.18*/routes/*16.24*/.TechnicianController.addTechnician()),format.raw/*16.61*/("""" method="post">
    First Name:<br>
      <input type="text" name="firstName" />
     <br>Last Name:<br>
      <input type="text" name="lastName" />
      <br>
      <button>Add Technician</button>
  </form>
  <a href=""""),_display_(/*24.13*/routes/*24.19*/.TechnicianController.getTechnicians()),format.raw/*24.57*/("""" class="btn">View all Technicians</a>
  
  
  <h4>Support Requests</h4>
  
  <form action=""""),_display_(/*29.18*/routes/*29.24*/.SupportRequestController.addSupportRequest()),format.raw/*29.69*/("""" method="post">
    Title:<br>
      <input type="text" name="title" />
      <br>Body:<br>
      <input type="text" name="body" />
      <br>Difficulty:<br>
      <input type="number" name="difficulty" />
      <br>
      <button>Add Support Request</button>
  </form>
  
  <a href=""""),_display_(/*40.13*/routes/*40.19*/.SupportRequestController.getSupportRequests()),format.raw/*40.65*/("""" class="btn">View all Support Requests</a>
  
  <br>
  
  <a href=""""),_display_(/*44.13*/routes/*44.19*/.SupportRequestController.create()),format.raw/*44.53*/("""" class="btn">Get Support</a>
  
  
  <!-- end ADDED. -->

  <div class="col-lg-6">
    <div class="well">
      """),_display_(/*51.8*/login(loginForm)),format.raw/*51.24*/("""
    """),format.raw/*52.5*/("""</div>

    <div class="well">
      """),_display_(/*55.8*/views/*55.13*/.html.account.signup.createFormOnly(signupForm)),format.raw/*55.60*/("""
    """),format.raw/*56.5*/("""</div>
  </div>
  
  
""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Oct 23 17:29:49 PDT 2016
                  SOURCE: /Users/timhdavis/GitHub/Play! framework/PlayStartApp/app/views/index.scala.html
                  HASH: 22a7c7111639af2cef2296dd1583228daa07443b
                  MATRIX: 789->1|943->80|957->87|1037->91|1068->96|1108->110|1122->116|1179->153|1254->77|1282->189|1310->192|1337->211|1376->213|1406->218|1434->226|1464->229|1651->389|1666->395|1724->432|1972->653|1987->659|2046->697|2166->790|2181->796|2247->841|2560->1127|2575->1133|2642->1179|2738->1248|2753->1254|2808->1288|2948->1402|2985->1418|3017->1423|3081->1461|3095->1466|3163->1513|3195->1518
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|36->1|38->5|40->7|40->7|40->7|42->9|42->9|43->10|49->16|49->16|49->16|57->24|57->24|57->24|62->29|62->29|62->29|73->40|73->40|73->40|77->44|77->44|77->44|84->51|84->51|85->52|88->55|88->55|88->55|89->56
                  -- GENERATED --
              */
          