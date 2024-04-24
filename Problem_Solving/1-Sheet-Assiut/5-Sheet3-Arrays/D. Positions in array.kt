fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        if (number == null) {
            continue
        }
        numbers.add(number.toLong())
    }
    for (i in numbers.indices) {
        if (numbers[i] <= 10)
            println("A[$i] = ${numbers[i]}")
    }
}

