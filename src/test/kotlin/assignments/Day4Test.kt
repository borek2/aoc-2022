package assignments

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day4Test {

    @Test
    fun part1_test() {
        val day = Day4(GetInput()(4))

        val result = day()

        assertEquals("2", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day4(GetInput()(4))

        val result = day()

        assertEquals("4", result.answerPart2)
    }
}