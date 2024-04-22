fun main() {
    val item = listOf(1,2,3,4,5)
    item.forEach { println(it) }

    println("===================")

    val users = listOf(
        User("Islam","Mohamed"),
        User("Ahmed","Mohamed")
    )
    users.forEach { println(it) }
    println("===================")
    val first = users.first()
    println(first)
    println("===================")
    val last = users.last()
    println(last)
    println("===================")

    val name:String? = null
    val stuff = if (name == null) emptyList() else listOf(name)
    println(stuff)

}

class User(var fristName: String, var lastName: String) {
    var fullName = "$fristName $lastName"

    override fun toString(): String {
        return fullName
    }
}