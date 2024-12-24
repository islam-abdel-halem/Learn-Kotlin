

import java.util.*


fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readln().toLong()
    val inputString = readln().split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        numbers.add(number!!.toLong())
    }
    val indexMin = numbers.indexOf(numbers.min())
    val indexMax = numbers.indexOf(numbers.max())
    Collections.swap(numbers, indexMin, indexMax)
    print(numbers.joinToString(" "))
}