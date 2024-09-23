package `Learn-Kotlin`.Code.`#5-OOP`

class D(var firstName: String, var lastName: String) {

    var fullName: String = "$firstName $lastName"
        get() = "FullName: $field"
        set(value) {
            if (value.startsWith("Islam")) {
                field = "Ali Abdel-Halem"
            } else {
                field = "Mohamed Abdel-Halem"
            }
        }
}

fun main() {
    val obj = D("Islam", "Abdel-Halem")
    println(obj.fullName)
    obj.fullName = "mo"
    println(obj.fullName)

}