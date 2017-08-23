package com.mars.rover.impl

import com.lightbend.lagom.scaladsl.api.ServiceLocator
import com.lightbend.lagom.scaladsl.api.ServiceLocator.NoServiceLocator
import com.lightbend.lagom.scaladsl.devmode.LagomDevModeComponents
import com.lightbend.lagom.scaladsl.server.{LagomApplication, LagomApplicationContext, LagomApplicationLoader}
import com.mars.rover.MarsRoverLagomService
import play.api.libs.ws.ahc.AhcWSComponents
import com.softwaremill.macwire._



class MarsRoverApplicationLoader extends LagomApplicationLoader {

    override def load(context: LagomApplicationContext): LagomApplication =
      new MarsRoverApplication(context) {
        override def serviceLocator: ServiceLocator = NoServiceLocator
      }

    override def loadDevMode(context: LagomApplicationContext): LagomApplication =
      new MarsRoverApplication(context) with LagomDevModeComponents

    override def describeService = Some(readDescriptor[MarsRoverLagomService])
  }

  abstract class MarsRoverApplication(context: LagomApplicationContext)
    extends LagomApplication(context)
      with AhcWSComponents {

    // Bind the service that this server provides
    override lazy val lagomServer = serverFor[MarsRoverLagomService](wire[MarsRoverLagomServiceImpl])

    }







