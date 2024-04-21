fun main() {
    val s = '*'
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        for (j in 1..i) {
            print(s)
        }
        println()
    }
}