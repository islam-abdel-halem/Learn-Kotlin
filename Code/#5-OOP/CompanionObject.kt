package `Learn-Kotlin`.Code.`#5-OOP`

class B {
    // using class not make instance
    companion object {
        var firstName:String = "Islam"
        var lastName:String = "Abdel-Halem"

        fun fullName():String = "$firstName $lastName"

        fun fullNameLength():Int {
            return fullName().length
        }
    }
}

fun main() {
    val obj = B.lastName
    println(obj)
    println(B.firstName)
    println(B.fullName())
    println(B.fullNameLength())
}