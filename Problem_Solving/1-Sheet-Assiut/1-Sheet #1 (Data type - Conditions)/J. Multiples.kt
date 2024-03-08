
fun main() {
    val (num1, num2) = readLine()!!.split(" ").map { it.toInt() }
    val result = if ((num1 % num2==0) || ( num2%num1==0) ) "Multiples" else "No Multiples"
    println(result)
    }

