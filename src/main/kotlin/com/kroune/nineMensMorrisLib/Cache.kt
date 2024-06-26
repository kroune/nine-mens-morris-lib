package com.kroune.nineMensMorrisLib

/**
 * Cache, used for caching positions analyzing
 */
object Cache {
    /**
     * <Position hash code, Pair<Depth, Solve result>>
     */
    private val localCache: HashMap<Long, Pair<UByte, Int>> = HashMap()

    /**
     * adds new cache if it didn't exist, or it had lower depth
     */
    fun addCache(pos: com.kroune.nineMensMorrisLib.Position, depth: UByte, evaluation: Int) {
        val hash = pos.longHashCode()
        val cacheData = com.kroune.nineMensMorrisLib.Cache.localCache[hash]
        if (cacheData == null || cacheData.first < depth) {
            com.kroune.nineMensMorrisLib.Cache.localCache[hash] = Pair(depth, evaluation)
        }
    }

    /**
     * @returns cached result of position solving or null if no proper cache exists
     */
    fun getCache(pos: com.kroune.nineMensMorrisLib.Position, neededDepth: UByte): Int? {
        val hash = pos.longHashCode()
        val cache = com.kroune.nineMensMorrisLib.Cache.localCache[hash]
        if (cache == null || cache.first < neededDepth) {
            return null
        }
        return cache.second
    }

    /**
     * WARNING: it should only be used for tests
     * cache doesn't need to be cleared
     */
    fun wipeCache() {
        com.kroune.nineMensMorrisLib.Cache.localCache.clear()
    }
}
