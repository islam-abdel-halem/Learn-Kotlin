
fun main() {
    val (num1, num2) = readLine()!!.split(" ").map { it.toDouble() }

    val result = if (num1 >= num2) "Yes" else "No"
    print(result)
}
