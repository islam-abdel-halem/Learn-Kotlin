package `Learn-Kotlin`.Code.`#5-OOP`

// Const as top level and strong data type
const val USER_NAME_FIELD = "UserName"
fun main() {
    val obj = UserInfo("Islam","Mohamed")
    println(UserInfo.MAX_AGE)
    USER_NAME_FIELD
}

class UserInfo(var firstName: String, var lastName: String) {
    companion object {
        const val MAX_AGE = 30
    }
}