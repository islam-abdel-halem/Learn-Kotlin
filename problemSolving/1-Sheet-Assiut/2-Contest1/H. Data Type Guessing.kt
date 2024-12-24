import java.math.BigDecimal

fun main() {
    val (n, k, a) = readLine()!!.split(" ").map { BigDecimal(it) }
    val equation = n.multiply(k).divide(a, 2, BigDecimal.ROUND_HALF_UP)
    val equation1 = equation.toLong()

    val checking = equation.subtract(BigDecimal(equation1))

    if (checking > BigDecimal.ZERO || checking < BigDecimal.ZERO) {
        println("double")
    } else if (equation1 <= Int.MAX_VALUE) {
        println("int")
    } else {
        println("long long")
    }
}




