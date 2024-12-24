import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val squ = scanner.nextInt()
    var min: Int = 0
    var flag = true
    var counter = 0

    for (i in 1..size) {
        val value = scanner.nextInt()
        if (flag) {
            min = value
            flag = false
        } else {
            if (value < min) {
                min = value
            }
        }
        counter++
        if (counter == squ || i == size) {
            print("$min ")
            counter = 0
            flag = true
        }
    }
}
