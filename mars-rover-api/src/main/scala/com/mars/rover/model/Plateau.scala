package com.mars.rover.model

import play.api.libs.json.{Format, Json}

case class Plateau(var topX:Int, var topY:Int){
    val bottomX = 0
    val bottomY = 0
}

object Plateau {

    implicit val format: Format[Plateau] = Json.format[Plateau]

}