package com.kr8ne.mensMorris

/**
 * pieces cost
 */
const val PIECE_COST = 1_000

/**
 * cost of additional moves (unnecessary) in winning positions
 */
const val DEPTH_COST = 1

/**
 * how much danger enemy unfinished triples are
 */
const val ENEMY_UNFINISHED_TRIPLES_COST = 3

/**
 * how much unfinished triple costs
 */
const val UNFINISHED_TRIPLES_COST = 200

/**
 * how much possible triple costs
 */
const val POSSIBLE_TRIPLE_COST = 5

/**
 * needed pieces to be able to fly over the board
 */
const val PIECES_TO_FLY: UByte = 3U

/**
 * a constant for lost games
 * we need it to be not INT.MIN_VALUE because we still want the least worst lost positions
 */
const val LOST_GAME_COST = -2_147_483_648 + 1_000_000

/**
 * fast, readable way for creating green piece
 */
const val GREEN = true

/**
 * fast, readable way for creating blue piece
 */
const val BLUE_ = false

/**
 * fast, readable way for creating empty piece
 */
inline val EMPTY: Boolean? get() = null

/**
 * a default game start position
 */
@Suppress("unused")
val gameStartPosition: Position
    get() {
        return Position(
            // @formatter:off
            arrayOf(
                EMPTY,                  EMPTY,                  EMPTY,
                        EMPTY,          EMPTY,          EMPTY,
                                EMPTY,  EMPTY,  EMPTY,
                EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                                EMPTY,  EMPTY,  EMPTY,
                        EMPTY,          EMPTY,          EMPTY,
                EMPTY,                  EMPTY,                  EMPTY
            ),
            // @formatter:on
            Pair(8u, 8u), pieceToMove = true
        )
    }
