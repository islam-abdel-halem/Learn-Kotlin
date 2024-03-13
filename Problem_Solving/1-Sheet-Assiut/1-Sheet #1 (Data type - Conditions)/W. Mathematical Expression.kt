fun main() {
    var output = ""

    val (num1, op, num2, equl, result) = readLine()!!.split(" ").map { it.toString() }
    if (op == "+") {

        output =
            if ((num1.toInt() + num2.toInt()) == result.toInt()) "Yes" else (num1.toInt() + num2.toInt()).toString()
    } else if (op == "-") {
        output =
            if ((num1.toInt() - num2.toInt()) == result.toInt()) "Yes" else (num1.toInt() - num2.toInt()).toString()
    } else if (op == "*") {
        output =
            if ((num1.toInt() * num2.toInt()) == result.toInt()) "Yes" else (num1.toInt() * num2.toInt()).toString()
    }
    println(output)
}