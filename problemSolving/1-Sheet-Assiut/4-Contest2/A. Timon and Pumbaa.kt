fun main() {
    val (Num1,Num2) = readln().split(" ").map { it.toInt() }
    val result = if (Num1-Num2 >=0 ) Num1-Num2 else 0
    print(result)
}