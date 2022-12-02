package assignments

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day2Test {

    @Test
    fun part1_test() {
        val day = Day2(GetInput()(2))

        val result = day()

        assertEquals("15", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day2(GetInput()(2))

        val result = day()

        assertEquals("12", result.answerPart2)
    }
}