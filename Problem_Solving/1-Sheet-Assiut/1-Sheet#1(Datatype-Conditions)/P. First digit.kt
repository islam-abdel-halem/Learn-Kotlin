fun main() {
    val number = readLine()!!.toInt()
    val check: Int = number/1000
    val result = if (check  % 2 == 0) "EVEN" else "ODD"
    print(result)
}
