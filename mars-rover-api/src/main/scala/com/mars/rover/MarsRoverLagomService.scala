package com.mars.rover

import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import com.mars.rover.model.Position

trait MarsRoverLagomService extends Service {

  def runInstruction(instructions :String) :ServiceCall[Position, Position]

  override final def descriptor = {
  import Service._
    named("mars-rover")
      .withCalls(
        restCall(Method.POST, "/api/position/:instructions", runInstruction _)
      )
      .withAutoAcl(true)
  }

}
