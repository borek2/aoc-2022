import assignments.Day1
import assignments.Day2
import assignments.Day3

fun main(args: Array<String>) {
    val answers = listOf(
        Day1(),
        Day2(),
        Day3()
    ).joinToString("\n") {
        "${it::class.java.simpleName}\n${it()}\n"
    }
    println(answers)
}
