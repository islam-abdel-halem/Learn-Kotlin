fun main() {

    val rows = readLine()!!.toInt()
    for (i in 1..rows) {
        val spaces = rows - i
        repeat(spaces) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }
}
