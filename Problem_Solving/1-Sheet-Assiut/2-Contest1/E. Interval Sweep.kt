import kotlin.math.abs

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val diff = abs(a - b)
    val result = when {
        a == 0 && b == 0 -> "NO"
        diff > 1 -> "NO"
        else -> "YES"
    }
    println(result)
}

