fun main() {
    val (x, p) = readLine()!!.split(" ").map { it.toDouble() }
    val output = p / (1 - x / 100)
    println("%.2f".format(output))
}