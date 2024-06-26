package com.kroune.nineMensMorrisLib.positions

import com.kr8ne.nineMensMorrisLib.BLUE_
import com.kr8ne.nineMensMorrisLib.EMPTY
import com.kr8ne.nineMensMorrisLib.GREEN
import com.kr8ne.nineMensMorrisLib.Position

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
