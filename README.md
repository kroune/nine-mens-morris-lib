## This project provides a library for a game called [**"Nine mens morris"**](https://en.wikipedia.org/wiki/Nine_men%27s_morris)

#### All information and source code are provided AS-IS, without express or implied warranties.

New game position is created using [position class](src/main/kotlin/com/kr8ne/mensMorris/Position.kt)

```kotlin
    val piecePlacements = arrayOf(
        GREEN,                  EMPTY,                  EMPTY,
                BLUE_,          EMPTY,          EMPTY,
                        EMPTY,  BLUE_,  EMPTY,
        EMPTY,  EMPTY,  EMPTY,          EMPTY,  EMPTY,  EMPTY,
                        EMPTY,  EMPTY,  EMPTY,
                EMPTY,          EMPTY,          EMPTY,
        EMPTY,                  EMPTY,                  EMPTY
    )

    Position(
        positions = piecePlacments,
        greenPiecesAmount = 4u,
        bluePiecesAmount = 2u,
        pieceToMove = false,
        removalCount = 1u
    )
```

**warning** it is recommended not to touch greenPiecesAmount/bluePiecesAmount, they are used for calculations speed up
breaking there functionality may lead to hardly debuggable behaviour

to get bot recommendation you can use 
```kotlin
    Position.solve(depth)
```
first element of the pair is final position evaluation (note: it is always calculated for green pieces)
and second one is winning move sequence (note: the first move is the last one in the sequence)



**Project progress**
1. [ ] write unit tests
2. [ ] use code style analyser
3. [ ] create a better hash function
4. [ ] reuse piece count data
5. [ ] reuse hash calculations
6. [ ] implement NNUE for position evaluation
7. [ ] create a table base of all possible moves
8. [ ] implement alpha-beta pruning (and move ordering)
9. [ ] reuse possible moves generation