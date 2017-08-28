package com.mars.rover.model

import play.api.libs.json.{Format, Json}

case class Instruction(id :Int, position: Position, instruction :String)

object Instruction{
  implicit val format: Format[Instruction] = Json.format[Instruction]
}
