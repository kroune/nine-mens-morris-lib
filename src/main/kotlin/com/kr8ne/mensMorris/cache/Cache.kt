package com.kr8ne.mensMorris.cache

import com.kr8ne.mensMorris.Position
import com.kr8ne.mensMorris.move.Movement

internal data object Cache : CacheI {
    /**
     * we store occurred positions here which massively increases speed
     */
    private val occurredPositions: MutableMap<Long, Pair<List<Movement>, UByte>> = mutableMapOf()
    override fun getCache(pos: Position, currentDepth: UByte): List<Movement>? {
        val hash = pos.longHashCode()
        val cache = occurredPositions[hash] ?: return null
        if (cache.second >= currentDepth) {
            return listOf()
        } else {
            occurredPositions[hash] = Pair(cache.first, currentDepth)
            return cache.first
        }
    }

    override fun addCache(pos: Position, generatedMoves: List<Movement>, currentDepth: UByte) {
        val hash = pos.longHashCode()
        occurredPositions[hash] = Pair(generatedMoves, currentDepth)
    }

    override fun resetCacheDepth() {
        occurredPositions.forEach { (key, value) ->
            occurredPositions[key] = Pair(value.first, 0u)
        }
    }

    override fun wipeCache() {
        occurredPositions.clear()
    }

    fun size(): Int {
        return occurredPositions.size
    }
}
