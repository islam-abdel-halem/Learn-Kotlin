// using valaible 
/*

fun main() {
    val (num1, num2, num3) = readLine()!!.split(" ").map { it.toInt() }


    val min = if (num1 <= num2 && num1 <= num3) num1 else if (num2 <= num1 && num2 <= num3) num2 else num3
    val max = if (num1 >= num2 && num1 >= num3) num1 else if (num2 >= num1 && num2 >= num3) num2 else num3
    val mid = num1 + num2 + num3 - min - max
    println("$min\n$mid\n$max\n")
    println("$num1\n$num2\n$num3")

}


*/

// using ArrayOf 

fun main() {
    var (num1, num2, num3) = readLine()!!.split(" ").map { it.toInt() }
    var numbers = arrayOf(num1, num2, num3)
    val copiedArray = numbers.copyOf()
    numbers.sort()
    numbers.forEach { println(it) }
    println()
    copiedArray.forEach { println(it) }
    
}