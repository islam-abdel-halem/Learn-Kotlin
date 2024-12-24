import kotlin.math.*

fun main() {
    val (num1, num2, num3, num4) = readLine()!!.split(" ").map { it.toDouble() }
    val output = if (num2 * ln(num1) > num4 * ln(num3)) "YES" else "NO"
    println(output)

}