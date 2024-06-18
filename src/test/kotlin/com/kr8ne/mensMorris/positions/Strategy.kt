package com.kr8ne.mensMorris.positions

import com.kr8ne.mensMorris.BLUE_
import com.kr8ne.mensMorris.EMPTY
import com.kr8ne.mensMorris.GREEN
import com.kr8ne.mensMorris.Position
import com.kr8ne.mensMorris.move.Movement

open class Strategy {
    val position1 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          BLUE_,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        0u, 0u, pieceToMove = true, removalCount = 0
    )

    val correctResult1 = Pair(
        -1999999996, mutableListOf<Movement>()
    )

    val position2 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    GREEN,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  GREEN,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          BLUE_,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        1u, 1u, pieceToMove = true, removalCount = 0
    )

    val correctResult2 = Pair(
        1999999998, mutableListOf(
            Movement(0, null),
            Movement(null, 18)
        )
    )

    val position3 = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  EMPTY,                  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
                            GREEN,  EMPTY,  GREEN,
            EMPTY,  EMPTY,  BLUE_,          EMPTY,  EMPTY,  EMPTY,
                            BLUE_,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          BLUE_,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        5u, 5u, pieceToMove = false, removalCount = 0
    )

    val correctResult3 = Pair(
        -10000, mutableListOf(
            Movement(null, 0),
            Movement(null, 7)
        )
    )

    val position4 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  BLUE_,
                    EMPTY,          BLUE_,          EMPTY,
                            EMPTY,  BLUE_,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          GREEN,  GREEN,  GREEN,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            BLUE_,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        0u, 0u, pieceToMove = false, removalCount = 0
    )

    val correctResult4 = Pair(
        -1999999998, mutableListOf(
            Movement(12, null),
            Movement(0, 1)
        )
    )

    val position5 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            GREEN,                  EMPTY,                  GREEN
        ),
        // @formatter:on
        6u, 7u, pieceToMove = false, removalCount = 0
    )

    val correctResult5 = Movement(null, 22)

    val position6 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    BLUE_,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            GREEN,                  EMPTY,                  GREEN
        ),
        // @formatter:on
        6u, 6u, pieceToMove = true, removalCount = 0
    )

    val correctResult6 = Movement(null, 22)

    val position7 = Position(
        // @formatter:off
        arrayOf(
            BLUE_,                  EMPTY,                  EMPTY,
                    BLUE_,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            GREEN,                  GREEN,                  GREEN
        ),
        // @formatter:on
        6u, 6u, pieceToMove = true, removalCount = 1
    )

    val correctResult7 = Movement(null, 22)

    /*
    0-----------------1-----------------2
    |                 |                 |
    |     3-----------4-----------5     |
    |     |           |           |     |
    |     |     6-----7-----8     |     |
    |     |     |           |     |     |
    9-----10----11          12----13----14
    |     |     |           |     |     |
    |     |     15----16----17    |     |
    |     |           |           |     |
    |     18----------19----------20    |
    |                 |                 |
    21----------------22----------------23
     */
}
