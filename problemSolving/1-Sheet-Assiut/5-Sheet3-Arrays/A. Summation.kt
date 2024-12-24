import kotlin.math.absoluteValue
fun main() {
    //input numbers in one line

    val numbers = mutableListOf<Long>()
    val numElements2 = readLine()?.toIntOrNull() ?: return
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        if (number == null) {
            continue
        }
        numbers.add(number.toLong())
    }
    print(numbers.sum().absoluteValue)
}

