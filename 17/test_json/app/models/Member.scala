package models

import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json._

object Member {
  
  case class Member(name: String, age: Int, job: String)

  implicit val memberWrites: Writes[Member] = (
    (JsPath \ "family" \ "name").write[String] and
    (JsPath \ "family" \ "age").write[Int] and
    (JsPath \ "family" \ "job").write[String])(unlift(Member.unapply))

  implicit val memberReads: Reads[Member] = (
    (JsPath \ "family" \ "name").read[String] and
    (JsPath \ "family" \ "age").read[Int] and
    (JsPath \ "family" \ "job").read[String])(Member.apply _)
     

  val jsonMembers: JsValue = Json.parse("""
      {
      "name" : "우리집",
      "location" : {
      "lat" : 125.35,
      "long" : 36.5
      },
      "family" : [ {
      "name" : "아빠",
      "age" : 50,
      "job" : "약사"
      }, {
      "name" : "엄마",
      "age" : 45,
      "job" : "선생님"
      }, {
      "name" : "나",
      "age" : 25,
      "job" : null
      }]
      }
      """)

  def memberList = {
    println(jsonMembers)
    jsonMembers
  }
  
//  val json: JsValue = Json.parse("""
//      {
//      "book": [
//      {
//      "id":"book01",
//      "author": "고순자",
//      "title": "XML 실전 가이드",
//      "genre": "컴퓨터",
//      "price": "39000",
//      "description": "xml에 대해서 자세히 알 수 있는 책입니다."
//      },
//      {
//      "id":"book02",
//      "author": "김말자",
//      "title": "101개의 초콜릿",
//      "genre": "판타지",
//      "price": "43000",
//      "description": "초콜릿 101개가 서로 싸우는 내용입니다."
//      }]
//      }
//      """)
      
    
//  case class User(id: Long, name: String, friends: List[User])
//
//  implicit object UserFormat extends Format[User] {
//    def reads(jv: JsValue): User = User(
//      (jv \ "id").as[Long],
//      (jv \ "name").as[String],
//      (jv \ "friends").asOpt[List[User]].getOrElse(List()))
//
//    def writes(u: User): JsValue = JsObject(List(
//      "id" -> JsNumber(u.id),
//      "name" -> JsString(u.name),
//      "friends" -> JsArray(u.friends.map(fr => JsObject(List("id" -> JsNumber(fr.id),
//        "name" -> JsString(fr.name)))))))
//  }
  
  

} //end object



