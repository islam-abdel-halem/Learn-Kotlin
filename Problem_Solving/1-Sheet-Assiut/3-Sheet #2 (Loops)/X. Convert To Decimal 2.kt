import kotlin.math.pow

fun main() {
    val counter = readLine()!!.toInt()
    
    for (i in 1..counter) {
        
        var number = readLine()!!.toLong()
        var ones = 0
        while (number > 0) {
            if ((number % 2).toInt() == 1)
                ones++
            number /= 2
        }
        
        var sum: Long = 0

        for (z in 0 until ones) {
            sum += (1 * 2.0.pow(z)).toLong()
        }
        println(sum)
    }
}