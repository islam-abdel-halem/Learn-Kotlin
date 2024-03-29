fun main() {
    val Number = readln()!!.toInt()
    for (it in 1..Number * 4) {
        if (it % 4 == 0)
            println("PUM")
        else
            print("$it ")
    }
}
