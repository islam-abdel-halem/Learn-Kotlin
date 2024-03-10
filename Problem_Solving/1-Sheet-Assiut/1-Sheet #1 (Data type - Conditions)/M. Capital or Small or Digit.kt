fun main() {
    val ch = System.`in`.read()

    if (ch in 97..122) print("ALPHA\nIS SMALL")
     else if (ch in 65..90) print("ALPHA\nIS CAPITAL")
     else if (ch in 48..57) print("IS DIGIT")
}
