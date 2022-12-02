package util

data class Answer(
    val answerPart1: String,
    val answerPart2: String,
) {

    override fun toString(): String {
        return """
            Answer part1: $answerPart1
            Answer part2: $answerPart2
        """.trimIndent()
    }
}
