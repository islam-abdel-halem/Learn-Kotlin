fun main() {
    var result = ""
    val (num1, op, num2) = readLine()!!.split(" ").map { it.toString() }
    if (op == ">") {
        result = if (num1.toInt() > num2.toInt()) "Right" else "Wrong"
    } else if (op == "<") {
        result = if (num1.toInt() < num2.toInt()) "Right" else "Wrong"
    } else if (op == "=") {
        result = if (num1.toInt() == num2.toInt()) "Right" else "Wrong"
    }
    println(result)
}