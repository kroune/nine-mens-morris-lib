package com.kroune.nineMensMorrisLib.positions

import com.kroune.nineMensMorrisLib.BLUE_
import com.kroune.nineMensMorrisLib.EMPTY
import com.kroune.nineMensMorrisLib.GREEN
import com.kroune.nineMensMorrisLib.Position

open class BasicEvaluation {
    val blueWinning1 = Position(
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
        pieceToMove = true
    )

    val blueWinning2 = Position(
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
        0u, 1u, pieceToMove = false
    )

    val blueWinning3 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  BLUE_,                  EMPTY
        ),
        // @formatter:on
        0u, 0u, pieceToMove = true
    )

    val blueWinning4 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          GREEN,
            EMPTY,                  BLUE_,                  EMPTY
        ),
        // @formatter:on
        0u, 1u, pieceToMove = true
    )

    val greenWinning1 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  BLUE_,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          GREEN,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = false
    )

    val greenWinning2 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  BLUE_,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          GREEN,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          GREEN,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = false
    )

    val greenWinning3 = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  EMPTY,                  BLUE_,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          GREEN,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          GREEN,          GREEN,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = false
    )

    val greenWinning4 = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  EMPTY,                  BLUE_,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          GREEN,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          GREEN,
            BLUE_,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        pieceToMove = false
    )
}
