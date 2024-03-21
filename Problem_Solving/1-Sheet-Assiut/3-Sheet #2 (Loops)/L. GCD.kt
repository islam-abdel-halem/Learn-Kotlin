import kotlin.math.min
fun main() {
    val (num1, num2) = readln().split(" ").map { it.toInt() }
    val GCD: Int = min(num1, num2)
    for (it in GCD downTo 1)
        if (num1 % it == 0 && num2 % it == 0) {
            println(it);
            break
        }
}
