package hello

object Main extends App
{
  implicit val system = ActorSystem("demo")

  //	val settings = Settings(system)
  val api = system.actorOf(ApiActor.props, "api-actor")

  IO(Http) ! Http.Bind(listener = api,
    interface = "0.0.0.0",
    port = 5000)
}