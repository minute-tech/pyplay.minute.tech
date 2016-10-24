
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

    

    """),format.raw/*12.5*/("""<fieldset>
        """),_display_(/*13.10*/inputText(
            supportRequestForm("text"),
            '_label -> "Title",
            'class -> "form-control"
        )),format.raw/*17.10*/("""
        """),_display_(/*18.10*/inputText(
            supportRequestForm("body"),
            '_label -> "Description of Problem",
            'class -> "form-control"
        )),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value="Submit">
        <a href=""""),_display_(/*27.19*/routes/*27.25*/.Application.index()),format.raw/*27.45*/("""" class="btn">Cancel</a>
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
                  DATE: Sun Oct 23 17:04:19 PDT 2016
                  SOURCE: /Users/timhdavis/GitHub/Play! framework/PlayStartApp/app/views/newSupportRequest.scala.html
                  HASH: 88abd480afe558b0f113b33072eda470450ede1a
                  MATRIX: 790->1|941->70|973->94|1057->50|1086->148|1114->150|1182->193|1265->268|1304->270|1343->282|1390->302|1540->431|1577->441|1744->587|1776->592|1934->723|1949->729|1990->749
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|38->8|38->8|38->8|42->12|43->13|47->17|48->18|52->22|53->23|57->27|57->27|57->27
                  -- GENERATED --
              */
          