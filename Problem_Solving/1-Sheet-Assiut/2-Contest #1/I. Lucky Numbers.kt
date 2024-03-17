fun main() {
    val input = readln()
    val num1 = input[0].toString().toInt()
    val num2 = input[1].toString().toInt()
    val result = if (num2 == 0) "YES" else if (num1 % num2 == 0 || num2 % num1 == 0) "YES" else "NO"
    println(result)
}