package com.mars.rover.impl.commands

import com.mars.rover.model.{Direction, Position}
import org.scalatest.FunSuite

class MoveTest extends FunSuite {

  test("moving toward E") {

    val move = new Move();
    val position = new Position(1, 2, Direction.E);
    move.move(position);
    assert(position.x == 2)
  }

  test("moving toward W") {
    val move = new Move();
    val position = new Position(1, 2, Direction.W);
    move.move(position);
    assert(position.x == 0)
  }

  test("moving toward N") {
    val move = new Move();
    val position = new Position(1, 2, Direction.N);
    move.move(position);
    assert(position.y == 3)
  }

  test("moving toward S") {
    val move = new Move();
    val position = new Position(1, 2, Direction.S);
    move.move(position);
    assert(position.y == 1)
  }

}
