package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Member
import play.api.libs.json.Json

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def list = Action {
    
    val json = Json.toJson(Member.memberList)
    val result = Json.stringify(json)
    
    Ok(views.html.list(result))
    
  }

}
