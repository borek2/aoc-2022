package assignments

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import util.GetInput

internal class Day3Test {

    @Test
    fun part1_test() {
        val day = Day3(GetInput()(3))

        val result = day()

        assertEquals("157", result.answerPart1)
    }

    @Test
    fun part2_test() {
        val day = Day3(GetInput()(3))

        val result = day()

        assertEquals("70", result.answerPart2)
    }
}
