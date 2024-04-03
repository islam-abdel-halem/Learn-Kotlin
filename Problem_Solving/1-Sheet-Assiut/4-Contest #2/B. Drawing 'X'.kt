fun main() {
    val counter = readLine()?.toIntOrNull() ?: return

    for (i in 0 until counter) {
        for (z in 0 until counter) {
            when {
                i == z && i != counter / 2 && z != counter / 2 -> print("\\")
                i == counter / 2 && z == counter / 2 -> print("X")
                z != counter / 2 && i == (counter - 1 - z) -> print("/")
                else -> print("*")
            }
        }
        println()
    }
}
