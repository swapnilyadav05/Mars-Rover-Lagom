package com.mars.rover.model

import play.api.libs.json.{Format, JsResult, JsValue, Json}

object Direction extends Enumeration {
  type Direction = Value
  val N, E, W, S = Value

  implicit val format = new Format[Direction.Value] {
    override def writes(o: Direction.Value): JsValue = Json.toJson(o.toString)

    override def reads(json: JsValue): JsResult[Direction.Value] = json.validate[String].map(Direction.withName(_))
  }
}
