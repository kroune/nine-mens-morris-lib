package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.cache.Cache
import com.kr8ne.mensMorris.positions.Caching
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

@Suppress("unused")
class CachingTest : Caching() {
    @Test
    fun `cache 0`() {
        position.solve(0u)
        assertEquals(Cache.size(), 0)
    }

    @Test
    fun `cache 1`() {
        position.solve(1u)
        assertEquals(Cache.size(), 1)
    }

    @Test
    fun `cache 2`() {
        position.solve(2u)
        assertEquals(Cache.size(), 8)
    }

    @Test
    fun `cache 3`() {
        position.solve(3u)
        assertEquals(Cache.size(), 42)
    }

    @Test
    fun `cache 4`() {
        position.solve(4u)
        assertEquals(Cache.size(), 209)
    }

    @Test
    fun `cache 5`() {
        position.solve(5u)
        assertEquals(Cache.size(), 822)
    }

    @Test
    fun `cache 6`() {
        position.solve(6u)
        assertEquals(Cache.size(), 3070)
    }

    @Test
    fun `check cache using`() {
        position.solve(4u).second
        assertEquals(position.solve(3u).second, mutableListOf<Position>())
        assertEquals(position.solve(4u).second, mutableListOf<Position>())
        assertNotEquals(position.solve(5u).second, mutableListOf<Position>())
    }

    @Test
    fun `check hash collisions`() {
        val generatedPositions: MutableMap<Position, Long> = mutableMapOf()
        // we generate different positions and put their hashes into the map
        val previousStepGeneratedMoves = mutableListOf(position)
        repeat(5) {
            // we can't directly add, or [ConcurrentModificationException] will be thrown
            val previousStepGeneratedMovesCopy = previousStepGeneratedMoves.toMutableList()
            previousStepGeneratedMoves.clear()
            previousStepGeneratedMovesCopy.forEach { pos ->
                pos.generateMoves(ignoreCache = true).forEach {
                    val newPos = it.producePosition(pos)
                    previousStepGeneratedMoves.add(newPos)
                    generatedPositions[newPos] = newPos.longHashCode()
                }
            }
        }
        // if any 2 positions have the same hash, they are equal
        // (if not - test is failed)
        val usedHashes = mutableMapOf<Long, Position>()
        generatedPositions.forEach {
            if (usedHashes[it.value] != null) {
                assertEquals(usedHashes[it.value]!!, it.key)
            } else {
                usedHashes[it.value] = it.key
            }
        }
    }

    @AfterEach
    fun clearCache() {
        Cache.wipeCache()
    }
}
