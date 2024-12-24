fun main() {
    val (number, range1, range2) = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0L
    for (i in 1..number) {
        val mySum = i.toString().map { it - '0' }.sum()
        if (mySum in range1..range2) {
            sum += i
        }
    }
    println(sum)
}
