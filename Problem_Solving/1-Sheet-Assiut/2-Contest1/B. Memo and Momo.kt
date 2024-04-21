fun main() {
    val (Memo, Momo, divisible) = readLine()!!.split(" ").map { it.toLong() }
    if ((Memo % divisible).toInt() == 0 && (Momo % divisible).toInt() == 0) println("Both")
    else if ((Memo % divisible).toInt() == 0 && (Momo % divisible).toInt() != 0) println("Memo")
    else if ((Memo % divisible).toInt() != 0 && (Momo % divisible).toInt() == 0) println("Momo")
    else println("No One")
}