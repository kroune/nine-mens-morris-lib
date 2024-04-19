package com.kr8ne.mensMorris

import com.kr8ne.mensMorris.move.Movement

/**
 * interface for position
 */
sealed interface PositionI {
    /**
     * all pieces
     * true = green
     * false = blue
     * null = empty
     */
    var positions: Array<Boolean?>

    /**
     * pieces we can still place: first - green, second - blue; both should be <= 8
     */
    var freePieces: Pair<UByte, UByte>

    /**
     * piece going to move next
     */
    var pieceToMove: Boolean

    /**
     * number of pieces to remove
     */
    var removalCount: Byte

    /**
     * evaluates position
     * @return pair, where first is eval. for green and the second one for blue
     */
    fun evaluate(depth: UByte = 0u): Pair<Int, Int>

    /**
     * @param depth current depth
     * @color color of the piece we are finding a move for
     * @return possible positions and there evaluation
     */
    fun solve(
        depth: UByte
    ): Pair<Pair<Int, Int>, MutableList<Movement>>

    /**
     * @return a copy of the current position
     */
    fun copy(): Position

    /**
     * @return possible movements
     */
    fun generateMoves(currentDepth: UByte = 0u, ignoreCache: Boolean = false): List<Movement>

    /**
     * @return state of the game
     */
    fun gameState(): GameState
}
