package com.kroune.nineMensMorrisLib.positions

import com.kroune.nineMensMorrisLib.BLUE_
import com.kroune.nineMensMorrisLib.EMPTY
import com.kroune.nineMensMorrisLib.GREEN
import com.kroune.nineMensMorrisLib.Position

open class GameStateTestData {
    val position1 = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  BLUE_,                  EMPTY,
                    BLUE_,          BLUE_,          BLUE_,
                            GREEN,  EMPTY,  EMPTY,
            GREEN,  EMPTY,  GREEN,          BLUE_,  EMPTY,  EMPTY,
                            GREEN,  EMPTY,  GREEN,
                    EMPTY,          GREEN,          EMPTY,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = true
    )

    val position2 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
                            BLUE_,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  BLUE_,          GREEN,  GREEN,  EMPTY,
                            BLUE_,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  BLUE_,                  GREEN
        ),
        // @formatter:on
        pieceToMove = true
    )
}
