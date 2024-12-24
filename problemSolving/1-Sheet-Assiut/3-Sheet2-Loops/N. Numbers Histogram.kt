fun main() {
    val S = readln()
    val N = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    for (it in numbers) {
        for (i in 1..it) {
            print(S)
        }
        println()
    }
}

