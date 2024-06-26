package com.kroune.nineMensMorrisLib

import com.kroune.nineMensMorrisLib.positions.Benchmark
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.RepeatedTest
import kotlin.system.measureTimeMillis

@Suppress("unused")
class BenchmarkTest : Benchmark() {
    // this test takes more time and not very useful most of the time
    @RepeatedTest(10)
    fun benchmark() {
        val time = measureTimeMillis {
            benchmark1.findBestMove(6u)
        }
        // TODO: replace with JMH tests
        println(time)
    }

    /*
    9922
    8685
    8030
    7825
    7616
    7548
    7680
    7501
    7429
    7394
     */

    @RepeatedTest(10)
    fun benchmark2() {
        val time = measureTimeMillis {
            benchmark2.findBestMove(4u)
        }
        // TODO: replace with JMH tests
        println(time)
    }

    /*
    1530
    1371
    1259
    1348
    1159
    1340
    1163
    1349
    1160
    1185
     */

    @AfterEach
    fun resetCache() {
        Cache.wipeCache()
    }
}
