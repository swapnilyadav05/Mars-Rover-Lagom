package com.mars.rover.impl

import com.lightbend.lagom.scaladsl.api.ServiceCall
import com.mars.rover.MarsRoverLagomService
import com.mars.rover.impl.commands.{Left, Move, Right}
import com.mars.rover.model.Position

import scala.concurrent.Future

class MarsRoverLagomServiceImpl extends MarsRoverLagomService {
  override def runInstruction(instructions: String): ServiceCall[Position, Position] = ServiceCall {
    request => {
      instructions.split("").map {
        case "L" => new Left()
        case "R" => new Right()
        case "M" => new Move()
      }.foreach((instruction) => instruction move request)
      Future.successful(request)
    }
  }

}
