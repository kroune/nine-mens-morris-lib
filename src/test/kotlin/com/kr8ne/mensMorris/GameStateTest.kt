package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.positions.GameStateTestData
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
