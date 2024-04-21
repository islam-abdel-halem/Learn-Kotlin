fun main() {
    val (num1, num2, num3, num4) = readLine()!!.split(" ").map { it.toLong() % 100 }
    val multiplication = num1 * num2 * num3 * num4

    if (multiplication % 100 <= 9) {
        println("0${multiplication % 100}")
    } else {
        println(multiplication % 100)
    }
}