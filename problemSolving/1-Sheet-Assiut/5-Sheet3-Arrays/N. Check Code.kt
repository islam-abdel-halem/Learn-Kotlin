package `Learn-Kotlin`.Problem_Solving.`1-Sheet-Assiut`.`5-Sheet3-Arrays`

fun main() {

    val (A, B) = readln().split(" ").map { it.toInt() }
    val S = readln()

    val charArray = S.toCharArray()
    var isValid = charArray[A] == '-'

    for (i in charArray.indices) {
        if (i != A && !charArray[i].isDigit()) {
            isValid = false
            break
        }
    }

    if (isValid) {
        println("Yes")
    } else {
        println("No")
    }
}
