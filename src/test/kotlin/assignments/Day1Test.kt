package assignments

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day1Test {

    @Test
    fun part1_test() {
        val day = Day1(GetInput()(1))

        val result = day()

        assertEquals("24000", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day1(GetInput()(1))

        val result = day()

        assertEquals("45000", result.answerPart2)
    }
}
