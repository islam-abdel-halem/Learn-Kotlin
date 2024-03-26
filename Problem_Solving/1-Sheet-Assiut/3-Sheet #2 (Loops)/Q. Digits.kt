fun main() {
    val counter = readLine()!!.toInt()

    for (i in 1..counter) {
        val number = readLine()!!
        val reversedString = number.reversed()
        for (char in reversedString) {
            print("$char ")
        }
        println()
    }
}
