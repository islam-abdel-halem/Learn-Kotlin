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
    val lowestNumber = numbers.minOrNull()

    if (lowestNumber != null) {
        println("$lowestNumber ${numbers.indexOf(lowestNumber) + 1}")
    } else {
        println("The list is empty.")
    }
}

