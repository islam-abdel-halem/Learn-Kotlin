import kotlin.math.*
fun main() {
    val (num1, num2, num3) = readLine()!!.split(" ").map { it.toInt() }
    val minimum = min(num1, min(num2,num3))
    val maximum = max(num1, max(num2,num3))
    println("$minimum $maximum")
    
}

