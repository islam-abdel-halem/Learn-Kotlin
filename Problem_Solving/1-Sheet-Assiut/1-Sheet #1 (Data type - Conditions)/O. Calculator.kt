fun main() {


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

}