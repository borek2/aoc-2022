import assignments.Day
import assignments.Day1

fun main(args: Array<String>) {
    val answers = listOf<Day>(
        Day1()
    ).joinToString("\n") {
        "${it::class.java.simpleName}\n${it()}\n"
    }
    println(answers)
}
