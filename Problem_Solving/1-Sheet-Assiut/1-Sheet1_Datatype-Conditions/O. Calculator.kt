// 1

/*fun main() {


    var input: String
    var char: Char? = null
    val listFirstAndSecond = mutableListOf<Int>()

    readln().let {
        input = it
    }


    for (i in input.indices) {
        if (!input[i].isDigit()) {
            char = input[i]
            break
        }
    }

    if (char != null) {
        input.split(char).forEach {
            listFirstAndSecond.add(it.toInt())
        }
    }

    when (char) {
        '+' -> print("${listFirstAndSecond[0] + listFirstAndSecond[1]}")
        '-' -> print("${listFirstAndSecond[0] - listFirstAndSecond[1]}")
        '*' -> print("${listFirstAndSecond[0] * listFirstAndSecond[1]}")
        '/' -> print("${listFirstAndSecond[0] / listFirstAndSecond[1]}")
    }

}*/


// 2

fun main() {
    val input = readLine() ?: return

    val operatorIndex = input.indexOfFirst { !it.isDigit() }
    if (operatorIndex == -1 || operatorIndex == input.lastIndex) {
        println("Invalid input")
        return
    }

    val firstNumber = input.substring(0, operatorIndex).toIntOrNull()
    val secondNumber = input.substring(operatorIndex + 1).toIntOrNull()
    val operator = input[operatorIndex]

    if (firstNumber == null || secondNumber == null) {
        println("Invalid input")
        return
    }

    val result = when (operator) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> if (secondNumber != 0) firstNumber / secondNumber else null
        else -> null
    }

    if (result != null) {
        println("$result")
    } else {
        println("Cannot divide by zero")
    }
}
