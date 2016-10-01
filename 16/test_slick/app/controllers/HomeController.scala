package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.MemberDataAccess
import scala.concurrent.ExecutionContext

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (md: MemberDataAccess)(implicit ec: ExecutionContext) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def memberCreate = Action {
    md.create
    Ok(views.html.index("Created"))
  }

  def memberInsert = Action {
    md.insert
    Ok(views.html.index("Inserted"))
  }

  def memberSelect = Action.async {
    md.getList map { m =>
      Ok(views.html.list(m))
    }
  }

}
