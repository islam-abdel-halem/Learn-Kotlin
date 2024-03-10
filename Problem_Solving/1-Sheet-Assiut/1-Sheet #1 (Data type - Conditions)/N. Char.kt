fun main() {
    var ch = System.`in`.read()

    if (ch in 97..122) {
        ch-=32
        println(ch.toChar())
    }
     else if (ch in 65..90) {
        ch+=32
        println(ch.toChar())
    }
}
