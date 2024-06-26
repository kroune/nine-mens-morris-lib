package com.kroune.nineMensMorrisLib

import com.kroune.nineMensMorrisLib.move.Movement

/**
 * maps solving result (sequence of winning moves) to the final position
 */
fun MutableList<Movement>.producePosition(startPos: Position): Position {
    var pos = startPos
    this.asReversed().forEach {
        pos = it.producePosition(pos)
    }
    return pos
}
