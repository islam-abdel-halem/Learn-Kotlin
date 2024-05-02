import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val counter = scanner.nextInt()

    repeat(counter) {
        val size = scanner.nextInt()
        val arr = IntArray(size)
        for (i in 0 until size) {
            arr[i] = scanner.nextInt()
            print("${arr[i]} ")
        }

        var i = 0
        var z = 0
        var ma = arr[0]  // Initialize ma outside the loop for efficiency

        while (z < size - 1) {
            if (i == z) {
                ma = Math.max(arr[i], arr[i + 1])
            } else {
                ma = Math.max(ma, arr[i + 1])
            }
            print("$ma ")
            i++
            if (i == size - 1) {
                z++
                i = z
            }
        }
        println()
    }
}
