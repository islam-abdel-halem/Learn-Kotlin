fun main() {
    val n = readLine()!!.toInt()
    for (it in 2..n) {

        val div = it / 2

        var isPrime = true
        for (i in 2..div) {
            if (it % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) print("$it ")
    }
}
