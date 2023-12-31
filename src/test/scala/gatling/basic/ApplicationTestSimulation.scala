package gatling.basic

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

class ApplicationTestSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8080") // set the base URL for all requests
    .acceptHeader("application/json")
    .contentTypeHeader("application/json")

  val scn = scenario("My Scenario").repeat(1000) {
    exec(http("Get Thread Name")
      .get("/home") // send a GET request to the /gatling endpoint
      .check(status.is(200))) // check that the response status code is 200
  }

  setUp(
    scn.inject(atOnceUsers(50)) // simulate one user that executes the scenario once
  ).protocols(httpProtocol)
}