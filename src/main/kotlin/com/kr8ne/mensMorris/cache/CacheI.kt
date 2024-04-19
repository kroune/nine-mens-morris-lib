package com.kr8ne.mensMorris.cache

import com.kr8ne.mensMorris.Position
import com.kr8ne.mensMorris.move.Movement

/**
 * interface for cache utils
 */
sealed interface CacheI {
    /**
     * gets a proper response to a cache call
     * @param pos we cash response for
     * @param currentDepth our current move generation depth
     * the smaller - the older the search is performed
     */
    fun getCache(pos: Position, currentDepth: UByte) : List<Movement>?

    /**
     * adds a new cache
     */
    fun addCache(pos: Position, generatedMoves: List<Movement>, currentDepth: UByte)

    /**
     * resets all depth caches that are used to abort unneeded searches
     */
    fun resetCacheDepth()

    /**
     * entirely deletes all cache
     * WARNINGS: it should only be used for testing
     */
    fun wipeCache()
}
