package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.move.Movement

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
