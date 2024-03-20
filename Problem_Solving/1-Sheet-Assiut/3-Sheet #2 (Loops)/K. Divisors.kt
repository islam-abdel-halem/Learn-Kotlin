fun main() {
    val n = readLine()!!.toInt()
    for (it in 1..n) if (n % it == 0) println(it)
}
