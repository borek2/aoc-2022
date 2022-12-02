import assignments.Day
import assignments.Day1
import assignments.Day2

fun main(args: Array<String>) {
    val answers = listOf<Day>(
        Day1(),
        Day2()
    ).joinToString("\n") {
        "${it::class.java.simpleName}\n${it()}\n"
    }
    println(answers)
}
