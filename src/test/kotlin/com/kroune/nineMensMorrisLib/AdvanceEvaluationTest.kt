package com.kroune.nineMensMorrisLib

import com.kroune.nineMensMorrisLib.positions.AdvanceEvaluation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class AdvanceEvaluationTest : AdvanceEvaluation() {
    @Test
    fun greenWinning1() {
        assertEquals(greenWinning1.evaluate(), 195)
    }

    @Test
    fun draw1() {
        assertEquals(draw1.evaluate(), 0)
    }

    @Test
    fun blueWinning1() {
        assertEquals(blueWinning1.evaluate(), -20202)
    }

    @Test
    fun blueWinning2() {
        assertEquals(blueWinning2.evaluate(), -20000)
    }
}
