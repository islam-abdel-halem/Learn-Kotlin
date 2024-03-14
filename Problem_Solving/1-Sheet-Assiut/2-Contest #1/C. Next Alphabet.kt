fun main() {
    var ch = System.`in`.read()
    if (ch.toChar() == 'z') {
        ch -= 25
        println(ch.toChar())
    } else {
        ch += 1
        println(ch.toChar())
    }
}