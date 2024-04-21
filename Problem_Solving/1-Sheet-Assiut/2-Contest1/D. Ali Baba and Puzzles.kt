fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toLong() }.toLongArray()

    if (a + b - c == d || a + b * c == d ||
        a - b + c == d || a - b * c == d ||
        a * b + c == d || a * b - c == d) {
        println("YES")
    } else {
        println("NO")
    }
}
