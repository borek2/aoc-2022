package assignments

import util.Answer
import util.GetInput

class Day2(
    private val input: List<String> = GetInput()(2),
) : Day {

    private val winMap = mapOf(
        Move.A to Move.C, Move.B to Move.A, Move.C to Move.B
    )

    override fun invoke(): Answer = Answer(getAnswerPart1(), getAnswerPart2())

    private fun getAnswerPart1() = input.fold(0) { totalScore, inputValue ->
        val (opponentMove, myMove) = Move.valueOf(inputValue[0].toString()) to part1MoveMap[inputValue[2]]!!

        when (opponentMove) {
            winMap[myMove] -> 6
            myMove -> 3
            else -> 0
        } + myMove.score + totalScore
    }.toString()

    private val part1MoveMap = mapOf(
        'X' to Move.A, 'Y' to Move.B, 'Z' to Move.C
    )

    private fun getAnswerPart2() = input.fold(0) { totalScore, inputValue ->
        val (opponentMove, outCome) = Move.valueOf(inputValue[0].toString()) to inputValue[2]

        when (outCome) {
            'X' -> 0 + winMap[opponentMove]!!.score
            'Y' -> 3 + opponentMove.score
            else -> 6 + winMap[winMap[opponentMove]]!!.score
        } + totalScore
    }.toString()

    private enum class Move(val score: Int) {
        A(1), B(2), C(3);
    }
}
