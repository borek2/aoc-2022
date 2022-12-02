package util

class GetInput {

    operator fun invoke(day: Int): List<String> {
        return this::class.java.classLoader.getResourceAsStream("day$day")?.bufferedReader()?.use {
            it.readLines()
        }.orEmpty()
    }
}
