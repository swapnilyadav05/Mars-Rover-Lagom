package com.mars.rover.impl.commands

import com.mars.rover.model.{Direction, Position}

class Move() extends Command {
  override def move(that: Position): Unit = that.direction match {
    case Direction.E => that.x =  that.x + 1
    case Direction.W => that.x =  that.x - 1
    case Direction.N => that.y =  that.y + 1
    case Direction.S => that.y =  that.y - 1
  }
}
