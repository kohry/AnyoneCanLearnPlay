
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object chat_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class chat extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main("Welcome to Play")),format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<script   src="https://code.jquery.com/jquery-3.1.0.js"   integrity="sha256-slogkvB1K3VOkzAI8QITxV3VzpOnkeNVsKvtkYLMjfk="   crossorigin="anonymous"></script>

<script>
var socket = new WebSocket(""""),_display_(/*7.30*/routes/*7.36*/.HomeController.chat.webSocketURL()),format.raw/*7.71*/("""")

socket.onopen = function(e)"""),format.raw/*9.28*/("""{"""),format.raw/*9.29*/(""" """),format.raw/*9.30*/("""console.log("연결확인") """),format.raw/*9.50*/("""}"""),format.raw/*9.51*/(""" 
"""),format.raw/*10.1*/("""socket.onmessage = function(e)"""),format.raw/*10.31*/("""{"""),format.raw/*10.32*/(""" """),format.raw/*10.33*/("""$("#chat_box").append("<p>" + e.data + "</p>") """),format.raw/*10.80*/("""}"""),format.raw/*10.81*/("""

"""),format.raw/*12.1*/("""$(document).ready(function() """),format.raw/*12.30*/("""{"""),format.raw/*12.31*/("""

	"""),format.raw/*14.2*/("""$("#btn_join").click(function() """),format.raw/*14.34*/("""{"""),format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""socket.send(JSON.stringify(
                    """),format.raw/*16.21*/("""{"""),format.raw/*16.22*/(""" """),format.raw/*16.23*/(""""type" : "join",
                      "username" : $("#txt_join").val() """),format.raw/*17.57*/("""}"""),format.raw/*17.58*/(""" 
                """),format.raw/*18.17*/("""))
	"""),format.raw/*19.2*/("""}"""),format.raw/*19.3*/(""");
	
	$("#btn_talk").click(function() """),format.raw/*21.34*/("""{"""),format.raw/*21.35*/("""
		"""),format.raw/*22.3*/("""socket.send(JSON.stringify(
                    """),format.raw/*23.21*/("""{"""),format.raw/*23.22*/(""" """),format.raw/*23.23*/(""""type" : "talk",
                      "username" : $("#txt_join").val(),
                      "msg" : $("#txt_talk").val() """),format.raw/*25.52*/("""}"""),format.raw/*25.53*/(""" 
                """),format.raw/*26.17*/("""))
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");	
	
	$("#btn_leave").click(function() """),format.raw/*29.35*/("""{"""),format.raw/*29.36*/("""
		"""),format.raw/*30.3*/("""socket.send(JSON.stringify(
                    """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/(""" """),format.raw/*31.23*/(""""type" : "leave",
                      "username" : $("#txt_join").val() """),format.raw/*32.57*/("""}"""),format.raw/*32.58*/(""" 
                """),format.raw/*33.17*/("""))
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/(""");	
	
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/(""");



</script>

<body>

별명 <input type = "text" id="txt_join"/>
<button id="btn_join">join</button>

<div id="chat_box"></div>

<input type = "text" id="txt_talk"/>
<button id="btn_talk">send</button>
</body>
<button id="btn_leave">leave</button>"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object chat extends chat_Scope0.chat
              /*
                  -- GENERATED --
                  DATE: Sun Oct 02 09:56:33 KST 2016
                  SOURCE: E:/Dropbox/scala book/play code/18/test_akka/app/views/chat.scala.html
                  HASH: 8324504460eb3096de278882aca925a35beb0b8e
                  MATRIX: 532->1|660->34|687->36|730->59|758->61|981->258|995->264|1050->299|1108->330|1136->331|1164->332|1211->352|1239->353|1268->355|1326->385|1355->386|1384->387|1459->434|1488->435|1517->437|1574->466|1603->467|1633->470|1693->502|1722->503|1752->506|1828->554|1857->555|1886->556|1987->629|2016->630|2062->648|2093->652|2121->653|2187->691|2216->692|2246->695|2322->743|2351->744|2380->745|2533->870|2562->871|2608->889|2639->893|2667->894|2735->934|2764->935|2794->938|2870->986|2899->987|2928->988|3030->1062|3059->1063|3105->1081|3136->1085|3164->1086|3197->1092|3225->1093
                  LINES: 20->1|25->1|26->2|26->2|28->4|31->7|31->7|31->7|33->9|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|36->12|36->12|36->12|38->14|38->14|38->14|39->15|40->16|40->16|40->16|41->17|41->17|42->18|43->19|43->19|45->21|45->21|46->22|47->23|47->23|47->23|49->25|49->25|50->26|51->27|51->27|53->29|53->29|54->30|55->31|55->31|55->31|56->32|56->32|57->33|58->34|58->34|60->36|60->36
                  -- GENERATED --
              */
          