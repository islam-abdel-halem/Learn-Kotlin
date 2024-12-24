package `Learn-Kotlin`.Problem_Solving.`1-Sheet-Assiut`.`5-Sheet3-Arrays`


fun main() {
    val arr = LongArray(51)
    arr[1] = 0
    arr[2] = 1

    val n = readlnOrNull()?.toIntOrNull() ?: return

    for (i in 3..n) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    println(arr[n])
}




/*
fun main() {

    val position = readlnOrNull()?.toLongOrNull() ?: return

    if (position == 1L) {
        println(0L)
        return
    } else if (position == 2L) {
        println(1L)
        return
    }

    var start = 0L
    var second = 1L

    for (i in 3..position) {
        val result = start + second
        start = second
        second = result
    }
    println(second)
}
*/
