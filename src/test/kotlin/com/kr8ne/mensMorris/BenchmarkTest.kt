package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.cache.Cache
import com.kr8ne.mensMorris.positions.Benchmark
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.RepeatedTest
import kotlin.system.measureTimeMillis

@Suppress("unused")
class BenchmarkTest : Benchmark() {
    @RepeatedTest(10)
    fun benchmark() {
        val time = measureTimeMillis {
            benchmark1.solve(6u)
        }
        // TODO: replace with JMH tests
        println(time)
    }

    /*
    10914
    8829
    9200
    8856
    8460
    8500
    8432
    8283
    8724
    8454
     */

    @RepeatedTest(10)
    fun benchmark2() {
        val time = measureTimeMillis {
            benchmark2.solve(4u)
        }
        // TODO: replace with JMH tests
        println(time)
    }

    /*
    1544
    1436
    1324
    1350
    1455
    1362
    1383
    1261
    1334
    1272
     */

    @AfterEach
    fun clearCache() {
        Cache.wipeCache()
    }
}
