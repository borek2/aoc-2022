import assignments.*

fun main(args: Array<String>) {
    val answers = listOf(
        Day1(),
        Day2(),
        Day3(),
        Day4(),
        Day5(),
        Day6(),
    ).joinToString("\n") {
        "${it::class.java.simpleName}\n${it()}\n"
    }
    println(answers)
}
