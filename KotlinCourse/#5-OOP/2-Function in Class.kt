class A (var firstName:String,var lastName:String){

    //s
    fun fullName():String = "$firstName $lastName"

    fun fullNameLength():Int {
        return fullName().length
    }
}

fun main() {
    val user = A("Islam","Abdel-Halem")
    println(user.fullName()) //  Islam Abdel-Halem
    println(user.fullNameLength()) // 17
}