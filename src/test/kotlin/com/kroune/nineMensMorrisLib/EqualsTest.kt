package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.Equals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class EqualsTest : Equals() {
    /**
     * this tests our copy method actually works
     */
    @Test
    fun `equals test`() {
        val position1 = position.copy()
        assertEquals(position, position1)
    }

    /**
     * this tests if our copy method actually works
     */
    @Test
    fun `not equals test`() {
        assertEquals(position, position2)
    }
}
