fun main() {
    //input numbers in one line

    val numElements2 = readLine()!!.toLong()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        if (number == null) {
            continue
        }
        if (number > 0)
            print("${1} ")
        else if (number < 0)
            print("${2} ")
        else
            print("${0} ")
    }
}

