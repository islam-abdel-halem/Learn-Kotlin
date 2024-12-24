fun main() {
    val size = readLine()!!.toInt()
    var result: Int = 0
    val numbers = readLine()!!.split(" ")

    for (numberStr in numbers) {
        var number = numberStr.toLong()
        var counter: Int = 0
        if (number % 2 != 0L) continue  // Skip odd numbers

        while (number > 0L) {
            if (number % 2 != 0L) break
            counter++
            number /= 2
        }
        result = maxOf(result, counter)
    }
    print(result)
}

