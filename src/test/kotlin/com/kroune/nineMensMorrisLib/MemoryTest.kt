package com.kroune.nineMensMorrisLib

import com.kr8ne.nineMensMorrisLib.positions.Memory
import org.junit.jupiter.api.Test

@Suppress("unused")
class MemoryTest : Memory() {
    /**
     * @throws OutOfMemoryError if failed
     */
    @Test
    fun `depth test`() {
        wonPosition.findBestMove(5u)
    }
}
