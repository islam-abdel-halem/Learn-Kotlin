// Selection Sort
fun main() {
    //input numbers in one line

    val arr = mutableListOf<Long>()
    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        arr.add(number!!.toLong())
    }
    var size = arr.size

    for (i in 0 until size - 1) {
        var minIndex = i
        var minValue = arr[i]
        for (j in i + 1 until size) {
            if (arr[j] < minValue) {
                minIndex = j
                minValue = arr[j]
            }
        }
        if (minIndex != i) { // Swap only if a smaller element is found
            val temp = arr[i]
            arr[i] = minValue
            arr[minIndex] = temp
        }
    }
    print(arr.joinToString(" "))
}

