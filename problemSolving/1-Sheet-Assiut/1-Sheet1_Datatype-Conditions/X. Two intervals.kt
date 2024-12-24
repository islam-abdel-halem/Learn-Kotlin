fun main() {


    val (l1, r1, l2, r2) = readLine()!!.split(" ").map { it.toInt() }
    if (l2 > r1 || r2 < l1) {
        println("-1")
    } else {
        println("${maxOf(l1, l2)} ${minOf(r1, r2)}")
    }
}