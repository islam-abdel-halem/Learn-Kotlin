import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val testCases = scanner.nextInt()

    repeat(testCases) {
        val size = scanner.nextInt()
        val arr = IntArray(size)
        for (i in 0 until size) {
            arr[i] = scanner.nextInt()
        }

        var min = Int.MAX_VALUE
        for (z in 1..size) {
            for (x in z + 1..size) {
                val result = arr[z - 1] + arr[x - 1] + (x - z)
                min = minOf(min, result)
            }
        }
        println(min)
    }
}


