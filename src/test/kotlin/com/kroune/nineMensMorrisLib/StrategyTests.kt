package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.Strategy
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class StrategyTests : Strategy() {
    @Test
    fun `winning test1`() {
        val ourResult = position1.findBestMove(2u)
        assertEquals(ourResult, correctResult1)
    }

    @Test
    fun `winning test2`() {
        val ourResult = position2.findBestMove(2u)
        assertEquals(ourResult, correctResult2)
    }

    @Test
    fun `winning test3`() {
        val ourResult = position3.findBestMove(2u)
        assertEquals(ourResult, correctResult3)
    }

    @Test
    fun `winning test4`() {
        val ourResult = position4.findBestMove(2u)
        assertEquals(ourResult, correctResult4)
    }

    @Test
    fun `winning test5`() {
        val ourResult = position5.findBestMove(4u)
        assertEquals(ourResult, correctResult5)
    }
}
