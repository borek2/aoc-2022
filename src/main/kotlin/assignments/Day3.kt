package assignments

import util.Answer
import util.GetInput

class Day3(
    private val input: List<String> = GetInput()(3),
) : Day {
    override fun invoke(): Answer = Answer(getAnswerPart1(), getAnswerPart2())

    private fun getAnswerPart1() = input
        .map { it.chunked(it.length / 2) }
        .sumOf { chunk -> chunk[0].find { chunk[1].contains(it) }!!.priority }
        .toString()

    private fun getAnswerPart2() = input
        .chunked(3)
        .sumOf { group -> group[0].find { char -> group[1].contains(char) && group[2].contains(char) }!!.priority }
        .toString()

    private val Char.priority: Int
        get() = if (isUpperCase()) code - UPPERCASE_OFFSET else code - LOWERCASE_OFFSET

    companion object {

        private const val UPPERCASE_OFFSET = 38 // 'A'.code (65) - 26 - 1
        private const val LOWERCASE_OFFSET = 96 // 'a'.code (97) - 1
    }
}
