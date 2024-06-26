package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.UnfinishedTriplesEvaluation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class UnfinishedTriplesEvaluationTest : UnfinishedTriplesEvaluation() {
    @Test
    fun draw1() {
        assertEquals(
            draw1.triplesEvaluation().first, Pair(1, 1)
        )
    }

    @Test
    fun greenWinning1() {
        assertEquals(
            greenWinning1.triplesEvaluation().first, Pair(1, 1)
        )
    }

    @Test
    fun greenWinning2() {
        assertEquals(
            greenWinning2.triplesEvaluation().first, Pair(1, 0)
        )
    }
}
