package assignments

import util.Answer
import util.GetInput
import kotlin.math.max

class Day4(
    private val input: List<String> = GetInput()(4),
) : Day {
    override fun invoke(): Answer = Answer(getAnswerPart1(), getAnswerPart2())

    private fun getAnswerPart1() = input
        .map { it.split(",").let { it[0].range to it[1].range } }
        .count { (range1, range2) -> // Check if a union results in the same amount of the largest set size
            range1.toSet().union(range2.toSet()).size == max(range1.toList().size, range2.toList().size)
        }
        .toString()

    private val String.range: IntRange
        get() = split("-").map { it.toInt() }.let { it[0] .. it[1] }

    private fun getAnswerPart2() = input
        .map { it.split(",").let { it[0].range to it[1].range } }
        .count { (range1, range2) -> // Check if a union size is smaller than the size of range1 and range 2 together
            range1.toSet().union(range2.toSet()).size < (range1.toList().size + range2.toList().size)
        }
        .toString()
}
