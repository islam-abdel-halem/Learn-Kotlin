import kotlin.math.*
 
// Function to return the sum of all natural numbers
fun sumNatural(n: Long): Long {
    val sum = (n * (n + 1)) / 2
    return sum
}
 
// Function to return the sum of all numbers in range L and R
fun sumInRange(l: Long, r: Long): Long {
    return sumNatural(r) - sumNatural(l - 1)
}
 
fun main() {
    var times: Long
    var sum: Long
    times = readLine()!!.toLong()
    repeat(times.toInt()) {
        val (start, end) = readLine()!!.split(" ").map { it.toLong() }
        sum = if (start < end) {
            sumInRange(start, end)
        } else {
            sumInRange(end, start)
        }
        println(sum)
    }
}