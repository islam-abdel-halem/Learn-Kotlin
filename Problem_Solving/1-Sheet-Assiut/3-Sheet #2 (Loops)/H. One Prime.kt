fun main() {
    val num = readLine()!!.toInt() // Read input as integer
    val div = num / 2

    var isPrime = true
    for (i in 2..div) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    println(if (isPrime) "YES" else "NO")
}

