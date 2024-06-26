package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.GameStateTestData
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class GameStateTest : GameStateTestData() {
    @Test
    fun `game state test 1`() {
        assertEquals(position1.gameState(), GameState.Normal)
    }

    @Test
    fun `game state test 2`() {
        assertEquals(position2.gameState(), GameState.Flying)
    }
}
