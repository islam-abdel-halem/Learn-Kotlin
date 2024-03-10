import kotlin.math.*
fun main() {
    val (fName1, lName1) = readLine()!!.split(" ")
    val (fName2, lName2) = readLine()!!.split(" ")
    val result = if (lName1 == lName2) "ARE Brothers" else "NOT"

    println(result)
}

