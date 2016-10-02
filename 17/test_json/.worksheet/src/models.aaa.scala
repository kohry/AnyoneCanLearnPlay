package models

import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json._

object aaa {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(575); 
    val json: JsValue = Json.parse("""
      {
      "book": [
      {
      "id":"book01",
      "author": "고순자",
      "title": "XML 실전 가이드",
      "genre": "컴퓨터",
      "price": "39000",
      "description": "xml에 대해서 자세히 알 수 있는 책입니다."
      },
      {
      "id":"book02",
      "author": "김말자",
      "title": "101개의 초콜릿",
      "genre": "판타지",
      "price": "43000",
      "description": "초콜릿 101개가 서로 싸우는 내용입니다.”
      }]
      }
      """);System.out.println("""json  : play.api.libs.json.JsValue = """ + $show(json ));$skip(231); 
      
      
  implicit val memberWrites: Writes[Member] = (
    (JsPath \ "family" \ "name").write[String] and
    (JsPath \ "family" \ "age").write[Int] and
    (JsPath \ "family" \ "job").write[String])(unlift(Member.unapply));System.out.println("""memberWrites  : play.api.libs.json.Writes[models.Member] = """ + $show(memberWrites ));$skip(205); 

  implicit val memberReads: Reads[Member] = (
    (JsPath \ "family" \ "name").read[String] and
    (JsPath \ "family" \ "age").read[Int] and
    (JsPath \ "family" \ "job").read[String])(Member.apply _);System.out.println("""memberReads  : play.api.libs.json.Reads[models.Member] = """ + $show(memberReads ));$skip(21); val res$0 = 
    
    jsonMembers;System.out.println("""res0: <error> = """ + $show(res$0))}
     
}
