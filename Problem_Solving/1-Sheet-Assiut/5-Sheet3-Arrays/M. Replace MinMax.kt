import java.util.*

fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        numbers.add(number!!.toLong())
    }
    var index_min = numbers.indexOf(numbers.min())
    var index_max = numbers.indexOf(numbers.max())
    Collections.swap(numbers, index_min, index_max)
    print(numbers.joinToString(" "))
}