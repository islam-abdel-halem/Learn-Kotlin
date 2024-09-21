package `Learn-Kotlin`.Problem_Solving.`1-Sheet-Assiut`.`5-Sheet3-Arrays`

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var t = scanner.nextInt()

    while (t-- > 0) {
        val n = scanner.nextInt()
        val arry = IntArray(n)

        for (i in 0 until n) {
            arry[i] = scanner.nextInt()
        }

        var counter = 0

        for (i in 0 until n) {
            counter++
            for (j in i + 1 until n) {
                if (arry[j] >= arry[j - 1])
                    counter++
                else
                    break
            }
        }
        println(counter)
    }
}
