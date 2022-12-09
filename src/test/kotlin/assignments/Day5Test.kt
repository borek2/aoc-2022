package assignments

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day5Test {

    @Test
    fun part1_test() {
        val day = Day5(GetInput()(5))

        val result = day()

        Assertions.assertEquals("CMZ", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day5(GetInput()(5))

        val result = day()

        Assertions.assertEquals("MCD", result.answerPart2)
    }
}
