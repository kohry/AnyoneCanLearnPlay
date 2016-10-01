package models

import java.util.Date
import java.util.Calendar

case class Member(mid: Int, userid: String, password: String, nickname: String, email: String, regdate: Option[Date])

object Member {
  def getList = { //컨트롤러에 회원 목록을 전달하는 함수
    members
  }
  
  var date = Option.apply(Calendar.getInstance.getTime)
  var members = Set(
    Member(1, "admin", "12345", "admin", "admin@google.com", date),
    Member(2, "Kim Gyu Bum", "1493", "Tiger2K", "Tiger2k@naver.com", date),
    Member(3, "Kim Gyu Tae", "1245", "gyutae", "int@int.com", date),
    Member(4, "gosoo", "345", "hasoo1007", "ex@exo.com", date))
}//end object Member