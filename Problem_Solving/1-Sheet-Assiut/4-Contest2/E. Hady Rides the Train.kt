fun main() {
    val seet = readLine()!!.toLong()
    val row = seet / 4
    val column: Long
    column = if (row % 2 == 0L) { 
        seet % 4 
    } else {
        3 - (seet % 4) 
    }
    println("$row $column")
}
