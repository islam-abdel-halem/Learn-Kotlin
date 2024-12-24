fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        numbers.add(number!!.toLong())
    }
    var size = numbers.size
    var result: String = ""
    for (i in 0..size / 2) {
        if (numbers[i] != numbers[size - 1 - i])
            result = "NO"
    }
    if (result.isEmpty())
        result = "YES"
    println(result)
}

