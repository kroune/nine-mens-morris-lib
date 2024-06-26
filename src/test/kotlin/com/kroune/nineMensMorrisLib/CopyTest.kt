package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.Copy
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class CopyTest : Copy() {
    /**
     * this tests if our copy method actually works
     */
    @Test
    fun `copy test1`() {
        val positionCopy = position.copy()
        positionCopy.positions[0] = null
        assertNotEquals(position, positionCopy)
    }

    /**
     * this tests if our copy method actually works
     */
    @Test
    fun `copy test2`() {
        val positionCopy = position.copy()
        positionCopy.positions[10] = null
        assertNotEquals(position, positionCopy)
    }
}
