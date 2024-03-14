
fun main() {
    //  variable number of arguments (vararg)
    printBookInf("Hello Kotlin","Islam","Ahmed","Ali")
}


fun printBookInf(title:String, vararg authors:String) {
    println("$title - Authors : ")
    authors.forEach { println(it) }
}