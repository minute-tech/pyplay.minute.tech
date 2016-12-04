
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newSupportRequest_Scope0 {
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

class newSupportRequest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.SupportRequest],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(supportRequestForm: Form[models.SupportRequest]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.80*/("""

"""),format.raw/*6.1*/("""<h3>New Support Request</h3>
            
"""),_display_(/*8.2*/form(routes.SupportRequestController.addSupportRequest(), 'class -> "form")/*8.77*/ {_display_(Seq[Any](format.raw/*8.79*/("""

    """),format.raw/*10.5*/("""<div class="container">
        <div class="well">

        <fieldset>
            """),_display_(/*14.14*/inputText(
                supportRequestForm("text"),
                '_label -> "Title",
                'class -> "form-control"
            )),format.raw/*18.14*/("""
            
            """),_display_(/*20.14*/inputText(
                supportRequestForm("body"),
                '_label -> "Description of Problem",
                'class -> "form-control"
            )),format.raw/*24.14*/("""
            
        """),format.raw/*26.9*/("""</fieldset>
    
        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value="Submit">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.Application.index()),format.raw/*30.49*/("""" class="btn">Cancel</a>
        </div>
    
     </div>
    </div>
""")))}))
      }
    }
  }

  def render(supportRequestForm:Form[models.SupportRequest]): play.twirl.api.HtmlFormat.Appendable = apply(supportRequestForm)

  def f:((Form[models.SupportRequest]) => play.twirl.api.HtmlFormat.Appendable) = (supportRequestForm) => apply(supportRequestForm)

  def ref: this.type = this

}


}

/**/
object newSupportRequest extends newSupportRequest_Scope0.newSupportRequest
              /*
                  -- GENERATED --
                  DATE: Sat Dec 03 11:33:50 PST 2016
                  SOURCE: /Users/timhdavis/GitHub/Play! framework/PlayStartApp/app/views/newSupportRequest.scala.html
                  HASH: 3efd9f40ab03766284340408bacf7e21d9975106
                  MATRIX: 790->1|941->70|973->94|1057->50|1086->148|1114->150|1182->193|1265->268|1304->270|1337->276|1448->360|1614->505|1668->532|1851->694|1900->716|2074->863|2089->869|2130->889
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|38->8|38->8|38->8|40->10|44->14|48->18|50->20|54->24|56->26|60->30|60->30|60->30
                  -- GENERATED --
              */
          