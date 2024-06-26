package com.kroune.nineMensMorrisLib.positions

import com.kroune.nineMensMorrisLib.BLUE_
import com.kroune.nineMensMorrisLib.EMPTY
import com.kroune.nineMensMorrisLib.GREEN
import com.kroune.nineMensMorrisLib.Position

open class UnfinishedTriplesEvaluation {
    val draw1 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = true
    )

    val greenWinning1 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        0u, 1u, pieceToMove = true
    )

    val greenWinning2 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  BLUE_,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = false
    )
}
