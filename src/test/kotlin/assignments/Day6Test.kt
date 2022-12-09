package assignments

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day6Test {

    @Test
    fun part1_test() {
        val day = Day6(GetInput()(6))

        val result = day()

        Assertions.assertEquals("7", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day6(GetInput()(6))

        val result = day()

        Assertions.assertEquals("MCD", result.answerPart2)
    }
}
