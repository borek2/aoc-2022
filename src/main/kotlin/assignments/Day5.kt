package assignments

import util.Answer
import util.GetInput
import java.util.*

class Day5(
    private val input: List<String> = GetInput()(5),
) : Day {

    override fun invoke(): Answer = Answer(getAnswerPart1(), getAnswerPart2())

    private fun getAnswerPart1(): String = input.let {
        val stacks = it.stacks

        it.moves.forEach { (amount, from, to) ->
            // Pop and push crates to corresponding stacks for x amount of time
            repeat(amount) {
                stacks[to - 1].push(
                    stacks[from - 1].pop()
                )
            }
        }

        stacks.joinToString("") { it.peek().toString() }
    }

    private fun getAnswerPart2(): String = input.let {
        val stacks = it.stacks

        it.moves.forEach { (amount, from, to) ->
            // Pop until amount, after that reverse and push it in that order to target stack
            (0 until amount)
                .mapNotNull { stacks[from - 1].takeIf { it.isNotEmpty() }?.pop() }
                .reversed()
                .forEach { stacks[to - 1].push(it) }
        }

        stacks.joinToString("") { it.peek().toString() }
    }

    private val List<String>.moves: List<Triple<Int, Int, Int>>
        get() = takeLastWhile { it != "" }.map {
            it.split(" ").let { Triple(it[1].toInt(), it[3].toInt(), it[5].toInt()) }
        }

    private val List<String>.stacks: List<Stack<Char>>
        get() = takeWhile { it != "" }.reversed().let { input ->
            // Create total amount of crate stacks
            val stacks = input[0].split(" ").count { it.isNotEmpty() }.let { MutableList<Stack<Char>>(it) { Stack() } }

            input.minus(input[0]).forEach { line ->
                line.crateSpots.forEachIndexed { index, crate ->
                    stacks[index] = stacks[index].apply {
                        // If containing crate, push to stack
                        if (crate.isLetter()) push(crate)
                    }
                }
            }
            stacks
        }

    private val String.crateSpots
        get() = chunked(4).map { it[1] }
}
