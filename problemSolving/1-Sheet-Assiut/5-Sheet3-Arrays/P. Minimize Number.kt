package `Learn-Kotlin`.Problem_Solving.`1-Sheet-Assiut`.`5-Sheet3-Arrays`

fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    var ans = Int.MAX_VALUE

    for (i in 0 until n) {
        var counter = 0
        var num = array[i]
        while (num % 2 == 0) {
            num /= 2
            counter++
        }
        ans = minOf(ans, counter)
    }

    println(ans)
}
