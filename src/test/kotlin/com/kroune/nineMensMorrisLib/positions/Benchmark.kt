package com.kroune.nineMensMorrisLib.positions

import com.kr8ne.nineMensMorrisLib.BLUE_
import com.kr8ne.nineMensMorrisLib.EMPTY
import com.kr8ne.nineMensMorrisLib.GREEN
import com.kr8ne.nineMensMorrisLib.Position

open class Benchmark {
    val benchmark1 = Position(
        // @formatter:off
        arrayOf(
            EMPTY,                  EMPTY,                  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
                    EMPTY,          EMPTY,          EMPTY,
            EMPTY,                  EMPTY,                  EMPTY
        ),
        // @formatter:on
        5u, 5u, pieceToMove = true
    )

    val benchmark2 = Position(
        // @formatter:off
        arrayOf(
            GREEN,                  EMPTY,                  EMPTY,
                    BLUE_,          EMPTY,          EMPTY,
                            EMPTY,  EMPTY,  EMPTY,
            EMPTY,  EMPTY,  EMPTY,          EMPTY,  GREEN,  EMPTY,
                            EMPTY,  EMPTY,  BLUE_,
                    EMPTY,          GREEN,          EMPTY,
            EMPTY,                  EMPTY,                  BLUE_
        ),
        // @formatter:on
        0u, 0u, pieceToMove = true
    )
}
