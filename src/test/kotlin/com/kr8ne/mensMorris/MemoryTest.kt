package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.positions.Memory
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
