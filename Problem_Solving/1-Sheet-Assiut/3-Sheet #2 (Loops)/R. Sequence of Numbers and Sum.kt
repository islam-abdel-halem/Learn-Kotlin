import kotlin.math.max
import kotlin.math.min
fun main() {
    while (true) {
        val (num1, num2) = readln().split(" ").map { it.toInt() }
        if (num1 > 0 && num2 > 0) {
            var min = min(num1, num2)
            var max = max(num1, num2)
            var sum: Int = 0
            for (it in min..max) {
                print("$it ")
                sum += it
            }
            println("sum =$sum")
        } else break
    }
}
