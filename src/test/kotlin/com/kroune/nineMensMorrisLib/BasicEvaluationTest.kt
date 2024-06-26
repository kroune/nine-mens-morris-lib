package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.BasicEvaluation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class BasicEvaluationTest : BasicEvaluation() {
    @Test
    fun greenWinning1() {
        assertEquals(greenWinning1.evaluate(), 2000000000)
    }

    @Test
    fun greenWinning2() {
        assertEquals(greenWinning2.evaluate(), 2000000000)
    }

    @Test
    fun greenWinning3() {
        assertEquals(greenWinning3.evaluate(), 2000000000)
    }

    @Test
    fun greenWinning4() {
        assertEquals(greenWinning4.evaluate(), 2000000000)
    }


    @Test
    fun blueWinning1() {
        assertEquals(blueWinning1.evaluate(), -2000000000)
    }

    @Test
    fun blueWinning2() {
        assertEquals(blueWinning2.evaluate(), -2000000000)
    }

    @Test
    fun blueWinning3() {
        assertEquals(blueWinning3.evaluate(), -2000000000)
    }

    @Test
    fun blueWinning4() {
        assertEquals(blueWinning4.evaluate(), -2000000000)
    }
}
