fun main() {
    var flag: Boolean = false
    val (num1, num2) = readln().split(" ").map { it.toInt() }
    for (i in num1..num2) {
        val isLucky = i.toString().all { it == '4' || it == '7' }
        if (isLucky) {
            print("$i ")
            flag = true
        }
    }
    if (!flag)
        print(-1)
}
