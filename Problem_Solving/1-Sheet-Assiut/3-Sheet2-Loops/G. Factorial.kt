import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var counter = scanner.nextInt()

    while (counter-- > 0) {
        val num = scanner.nextInt()
        var fac = 1L
        for (i in 1..num) {
            fac *= i.toLong() 
        }

        println(fac)
        fac = 1L
    }
}
