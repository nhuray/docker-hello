package hello
// import SprayJsonSupport._

// 2 spaces indentation
case class Demo(greeting: String, name: String)

object Demo {
  implicit val jsonFormat = jsonFormat2(Demo.apply)
}

object ApiActor {
  def props = Props[ApiActor]
  // can pass function
}

class ApiActor extends HttpServiceActor with ActorLogging
{
  def receive = runRoute(
    //pathPrefix("foo") {
    path("/") {
      get {
        //				complete(Demo("hello","world!"))
        complete("hello, world!")
        // complete(404)
      } ~
        put {
          /*	entity(as[Demo]) { demo =>
              complete {
                Demo(demo.name, demo.greeting)
              }
            }*/
          complete("foo, bar!")
        }
    }
  )
}
