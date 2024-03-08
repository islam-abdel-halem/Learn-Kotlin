import java.lang.Math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt
fun main() {
val (num1, num2) = readLine()!!.split(" ").map { it.toDouble() }

    val floor = floor((num1/num2))
    println("floor ${num1.toInt()} / ${num2.toInt()} = ${floor.toInt()}")

    val ceil = ceil((num1/num2))
    println("ceil ${num1.toInt()} / ${num2.toInt()} = ${ceil.toInt()}")

    val round= (num1 / num2).roundToInt()
    println("round ${num1.toInt()} / ${num2.toInt()} = $round")
}
