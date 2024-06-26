package com.kroune.nineMensMorrisLib.positions

import com.kr8ne.nineMensMorrisLib.BLUE_
import com.kr8ne.nineMensMorrisLib.EMPTY
import com.kr8ne.nineMensMorrisLib.GREEN
import com.kr8ne.nineMensMorrisLib.Position

open class Memory {
    val wonPosition = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  EMPTY,                  BLUE_,
                    EMPTY,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  BLUE_,
            EMPTY,  EMPTY,  GREEN,          EMPTY,  EMPTY,  EMPTY,
                            GREEN,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  GREEN
        ),
        // @formatter:on
        0u, 1u,
        pieceToMove = true
    )
}
