package com.mars.rover.impl

import com.lightbend.lagom.scaladsl.server.LocalServiceLocator
import com.lightbend.lagom.scaladsl.testkit.ServiceTest
import com.mars.rover.MarsRoverLagomService
import com.mars.rover.model.{Direction, Position}
import org.scalatest.{AsyncWordSpec, Matchers}

class MarsRoverSpec extends AsyncWordSpec with Matchers {

    "The Mars-Rover Service" should {
      "run Instructions with Position 3, 3, E" in ServiceTest.withServer(ServiceTest.defaultSetup) { ctx =>
        new MarsRoverApplication(ctx) with LocalServiceLocator
      } { server =>
        val client = server.serviceClient.implement[MarsRoverLagomService]

        client.runInstruction("MMRMMRMRRM").invoke(new Position(3, 3, Direction.E)).map { response =>
          response shouldEqual new Position(5, 1, Direction.E)
        }
      }

      "run Instructions with position 1,2,N" in ServiceTest.withServer(ServiceTest.defaultSetup) { ctx =>
        new MarsRoverApplication(ctx) with LocalServiceLocator
      } { server =>
        val client = server.serviceClient.implement[MarsRoverLagomService]

        client.runInstruction("LMLMLMLMM").invoke(new Position(1, 2, Direction.N)).map { response =>
          response shouldEqual new Position(1, 3, Direction.N)
        }
      }
    }

}
