package com.mars.rover.model

import com.mars.rover.model.Direction.Direction
import play.api.libs.json.{Format, Json}

case class Position(var x:Int, var y:Int, var direction :Direction )

object Position {

  implicit val format: Format[Position] = Json.format[Position]

}

