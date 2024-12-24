fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")
    val x = readLine()!!.toLong()

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        if (number == null) {
            continue
        }
        numbers.add(number.toLong())
    }
    val index = numbers.indexOf(x)
    println(index)
}

