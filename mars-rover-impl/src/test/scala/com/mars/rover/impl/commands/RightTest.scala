package com.mars.rover.impl.commands

import com.mars.rover.model.{Direction, Position}
import org.scalatest.FunSuite

class RightTest extends FunSuite {

  test("An direction should changed to  S after moving right from E") {
    val right  = new Right()
    val position = new Position(1, 2, Direction.E)
    right.move(position)
    assert(position.direction == Direction.S)
  }

  test("An direction should changed to  N after moving right from W") {
    val right  = new Right()
    val position = new Position(1, 2, Direction.W)
    right.move(position)
    assert(position.direction == Direction.N)
  }

  test("An direction should changed to  E after moving right from N") {
    val right = new Right()
    val position = new Position(1, 2, Direction.N)
    right.move(position)
    assert(position.direction == Direction.E)
  }

  test("An direction should changed to  W after moving right from N") {
    val right  = new Right()
    val position = new Position(1, 2, Direction.S)
    right.move(position)
    assert(position.direction == Direction.W)
  }

}
