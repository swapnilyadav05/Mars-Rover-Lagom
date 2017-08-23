package com.mars.rover.impl.commands

import com.mars.rover.model.{Direction, Position}

class Left extends Command {
  override def move(that: Position): Unit = that.direction match {
    case Direction.E => that.direction = Direction.N
    case Direction.W => that.direction = Direction.S
    case Direction.N => that.direction = Direction.W
    case Direction.S => that.direction = Direction.E
  }
}
