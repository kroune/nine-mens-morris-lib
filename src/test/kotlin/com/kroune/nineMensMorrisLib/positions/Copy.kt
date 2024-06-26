package com.kroune.nineMensMorrisLib.positions

import com.kroune.nineMensMorrisLib.BLUE_
import com.kroune.nineMensMorrisLib.EMPTY
import com.kroune.nineMensMorrisLib.GREEN
import com.kroune.nineMensMorrisLib.Position

open class Copy {
    val position = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          BLUE_,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  GREEN,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  BLUE_
        ),
        // @formatter:on
        pieceToMove = true
    )
}
