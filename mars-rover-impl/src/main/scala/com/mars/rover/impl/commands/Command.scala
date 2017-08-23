package com.mars.rover.impl.commands

import com.mars.rover.model.Position

trait Command {
  def move(that: Position)
}
