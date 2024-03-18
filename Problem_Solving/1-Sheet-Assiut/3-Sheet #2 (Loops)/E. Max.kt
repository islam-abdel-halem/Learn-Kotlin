fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    val maxNumber = numbers.maxOrNull()

    println(maxNumber)
}