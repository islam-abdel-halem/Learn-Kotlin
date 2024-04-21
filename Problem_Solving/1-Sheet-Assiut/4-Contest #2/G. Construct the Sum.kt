fun main() {
    val testCaseCount = readLine()!!.toLong()

    for (i in 0 until testCaseCount.toInt()) {
        val (num1, num2) = readLine()!!.split(" ").map { it.toLong() }

        if (num1 * (num1 + 1) / 2 < num2) {
            println(-1)
        } else {
            var sum = 0L
            val res = mutableListOf<Long>()

            for (z in num1 downTo 1L) {
                if (sum + z <= num2 && z != num2) {
                    sum += z
                    res.add(z)
                }
                if (sum == num2) break
            }

            println(res.joinToString(" "))
        }
    }
}
