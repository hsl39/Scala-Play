package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc._

@Singleton
class TestController @Inject()(val controllerComponents: ControllerComponents) extends BaseController{

  def testAction = Action{
    request => Ok("Got request [" + request + "]")
  }

}
