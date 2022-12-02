package assignments

import util.Answer
import util.GetInput

class Day1(
    private val input: List<String> = GetInput()(1),
) : Day {

    override operator fun invoke(): Answer {
        return Answer(
            getAnswerPart1(),
            getAnswerPart2()
        )
    }

    private fun getAnswerPart1(): String = topCaloriesSum(top = 1).toString()

    private fun getAnswerPart2(): String = topCaloriesSum(top = 3).toString()

    private tailrec fun topCaloriesSum(
        n: Int = 0,
        calories: Int = 0,
        maxCalories: List<Int> = emptyList(),
        top: Int,
    ): Int =
        when {
            n >= input.size -> maxCalories.plus(calories).sortedDescending().take(top).sum()
            input[n] == "" -> topCaloriesSum(n + 1, 0, maxCalories.plus(calories), top)
            else -> topCaloriesSum(n + 1, calories + input[n].toInt(), maxCalories, top)
        }
}
