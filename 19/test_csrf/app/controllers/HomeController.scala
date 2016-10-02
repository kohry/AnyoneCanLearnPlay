package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.filters.csrf._
import play.api.data.Forms._
import play.api.data.Form
import models.Member

@Singleton
class HomeController @Inject() extends Controller {

  val joinForm = Form(
    mapping(
      "mid" -> ignored(0),
      "userid" -> nonEmptyText,
      "password" -> nonEmptyText)(Member.apply)(Member.unapply _))

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def form = Action { implicit request =>
    implicit val token = CSRF.getToken(request).get
    Ok(views.html.form(joinForm))
  }

  def save = Action {
    Ok(views.html.index("saved"))
  }

}
