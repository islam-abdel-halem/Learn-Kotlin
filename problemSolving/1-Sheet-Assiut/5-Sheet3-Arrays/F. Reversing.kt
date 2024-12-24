fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        numbers.add(number!!.toLong())
    }
    for (i in numbers.size - 1 downTo 0) {
        print("${numbers[i]} ")
    }
}

