package assignments

import util.Answer
import util.GetInput

class Day6(
    private val input: List<String> = GetInput()(6),
) : Day {
    override fun invoke(): Answer = Answer(getAnswerPart1(), getAnswerPart2())

    private fun getAnswerPart1(): String = getMarkerIndex(input.first()).toString()

    private tailrec fun getMarkerIndex(stream: String, index: Int = 0, lookBackAmount: Int = 4): Int =
        if (stream.take(index).takeLast(lookBackAmount).toSet().size == lookBackAmount) {
            index
        } else {
            getMarkerIndex(stream, index + 1, lookBackAmount)
        }

    private fun getAnswerPart2(): String = getMarkerIndex(input.first(), lookBackAmount = 14).toString()
}
