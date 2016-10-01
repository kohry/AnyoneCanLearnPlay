package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Member

@Singleton
class Application @Inject() extends Controller {
  
  def list = Action {
    Ok(views.html.index(Member.getList))
  }
  
}