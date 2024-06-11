package com.kr8ne.mensMorris.cache

import com.kr8ne.mensMorris.Position
import com.kr8ne.mensMorris.move.Movement

/**
 * provides interface for accessing cache functions
 */
object Cache {
    /**
     * we store occurred positions here which massively increases speed
     */
    private val occurredPositions: HashMap<Long, Pair<List<Movement>, UByte>> = hashMapOf()

    /**
     * gets a proper response to a cache call
     * @param pos we cash response for
     * @param currentDepth our current move generation depth
     * the smaller - the older the search is performed
     */
    fun getCache(pos: Position, currentDepth: UByte): List<Movement>? {
        val hash = pos.longHashCode()
        val cache = occurredPositions[hash] ?: return null
        if (cache.second >= currentDepth) {
            return listOf()
        } else {
            occurredPositions[hash] = Pair(cache.first, currentDepth)
            return cache.first
        }
    }

    /**
     * adds a new cache
     */
    fun addCache(pos: Position, generatedMoves: List<Movement>, currentDepth: UByte) {
        val hash = pos.longHashCode()
        occurredPositions[hash] = Pair(generatedMoves, currentDepth)
    }

    /**
     * resets all depth caches that are used to abort unneeded searches
     */
    @Suppress("unused")
    fun resetCacheDepth() {
        occurredPositions.forEach { (key, value) ->
            occurredPositions[key] = Pair(value.first, 0u)
        }
    }

    /**
     * entirely deletes all cache
     * WARNING: it should only be used for testing
     */
    fun wipeCache() {
        occurredPositions.clear()
    }

    /**
     * gets size of occurred positions
     * Tests only
     */
    fun size(): Int {
        return occurredPositions.size
    }
}
