import java.io.File

fun main() {
    fun parseInput(input: String):List<List<Int>> = input.split("\n\n").map { elf:String -> elf.lines().map { it.toInt() }}

    fun part1(input: String): Int {
        val data:List<List<Int>> = parseInput(input)
        return data.maxOf { it.sum() }
    }

    fun part2(input: String): Int {
        val data:List<List<Int>> = parseInput(input)
        return data.map { it.sum() }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput:String = File("src/Day01_test.txt").readText()
    check(part1(testInput) == 24000)

    val input:String = File("src/Day01.txt").readText()
    println(part1(input))
    println(part2(input))
}
