package com.mars.rover.impl.commands

import com.mars.rover.model.{Direction, Position}
import org.scalatest.FunSuite

class LeftTest extends FunSuite {

  test("An direction should changed to  N after moving left from E") {
    val left :Left = new Left();
    val position = new Position(1, 2, Direction.E);
    left.move(position);
    assert(position.direction == Direction.N)
  }

  test("An direction should changed to  S after moving left from W") {
    val left :Left = new Left();
    val position = new Position(1, 2, Direction.W);
    left.move(position);
    assert(position.direction == Direction.S)
  }

  test("An direction should changed to  W after moving left from N") {
    val left :Left = new Left();
    val position = new Position(1, 2, Direction.N);
    left.move(position);
    assert(position.direction == Direction.W)
  }

  test("An direction should changed to  N after moving left from N") {
    val left :Left = new Left();
    val position = new Position(1, 2, Direction.S);
    left.move(position);
    assert(position.direction == Direction.E)
  }

}
