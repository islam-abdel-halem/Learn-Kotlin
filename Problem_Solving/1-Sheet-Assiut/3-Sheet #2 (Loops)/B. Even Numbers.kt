fun main() {
    val N = readLine()!!.toInt()
    if (N < 2) println(-1) else for (it in 2..N step 2) println(it)
}