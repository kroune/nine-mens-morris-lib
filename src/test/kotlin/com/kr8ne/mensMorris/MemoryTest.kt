package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.positions.Memory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable

@Suppress("unused")
class MemoryTest : Memory() {
    /**
     * @throws OutOfMemoryError if failed
     */
    @EnabledIfEnvironmentVariable(named = "FULL_TEST", matches = true.toString())
    @Test
    fun `depth test`() {
        wonPosition.solve(5u).second
    }
}
