
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object comm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class comm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main("Welcome to Play")),format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
var socket = new WebSocket(""""),_display_(/*4.30*/routes/*4.36*/.HomeController.comm.webSocketURL()),format.raw/*4.71*/("""")
socket.onopen = function(e)"""),format.raw/*5.28*/("""{"""),format.raw/*5.29*/("""
		"""),format.raw/*6.3*/("""console.log(e)
        console.log("연결")
        
        socket.send(JSON.stringify(
                    """),format.raw/*10.21*/("""{"""),format.raw/*10.22*/(""" """),format.raw/*10.23*/(""""type" : "join",
                      "username" : "gorakgarak" """),format.raw/*11.49*/("""}"""),format.raw/*11.50*/(""" 
                """),format.raw/*12.17*/("""))
                
                        socket.send(JSON.stringify(
                    """),format.raw/*15.21*/("""{"""),format.raw/*15.22*/(""" """),format.raw/*15.23*/(""""type" : "talk",
                      "username" : "gorakgarak",
                       "msg" : "hihihihihihithis""""),format.raw/*17.50*/("""}"""),format.raw/*17.51*/(""" 
                """),format.raw/*18.17*/("""))
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""socket.onmessage = function(e)"""),format.raw/*20.31*/("""{"""),format.raw/*20.32*/("""
        """),format.raw/*21.9*/("""console.log("서버로부터 데이터 받음!  : " + e.data)
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""</script>

"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object comm extends comm_Scope0.comm
              /*
                  -- GENERATED --
                  DATE: Sun Oct 02 09:56:33 KST 2016
                  SOURCE: E:/Dropbox/scala book/play code/18/test_akka/app/views/comm.scala.html
                  HASH: 210e6ef6a157c5362bc8b21bd5bc353d6c050376
                  MATRIX: 532->1|660->34|687->36|730->59|757->60|821->98|835->104|890->139|947->169|975->170|1004->173|1138->279|1167->280|1196->281|1289->346|1318->347|1364->365|1484->457|1513->458|1542->459|1685->574|1714->575|1760->593|1790->596|1818->597|1846->598|1904->628|1933->629|1969->638|2038->680|2066->681|2094->682
                  LINES: 20->1|25->1|26->2|26->2|27->3|28->4|28->4|28->4|29->5|29->5|30->6|34->10|34->10|34->10|35->11|35->11|36->12|39->15|39->15|39->15|41->17|41->17|42->18|43->19|43->19|44->20|44->20|44->20|45->21|46->22|46->22|47->23
                  -- GENERATED --
              */
          