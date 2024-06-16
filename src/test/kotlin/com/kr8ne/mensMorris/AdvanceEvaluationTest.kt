package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.positions.AdvanceEvaluation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class AdvanceEvaluationTest : AdvanceEvaluation() {
    @Test
    fun greenWinning1() {
        assertEquals(greenWinning1.evaluate(), Pair(195, -595))
    }

    @Test
    fun draw1() {
        assertEquals(draw1.evaluate(), Pair(0, 0))
    }

    @Test
    fun blueWinning1() {
        assertEquals(blueWinning1.evaluate(), Pair(-20405, 19605))
    }

    @Test
    fun blueWinning2() {
        assertEquals(blueWinning2.evaluate(), Pair(-20000, 20000))
    }
}
