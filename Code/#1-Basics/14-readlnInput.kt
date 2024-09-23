package Code.`#1-Basics`

fun main() {
    val name1 = readln()
    println("Hello, ${name1.length}- letter person!!")
    val name2 = readlnOrNull()
    println("Hello, ${name2!!.length}- letter person!!")
}