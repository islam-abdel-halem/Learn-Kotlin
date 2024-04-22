fun main() {
    // Arrays
    
    val item1 = arrayOf(1, 4, 4.43, "islam",8)
    item1.forEach { println(it) }
    println("==============================================")

    val item2 = intArrayOf(1, 2, 3, 4, 5)
    item2.forEach { println(it) }

    println("================================")

    val item3 = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    item3.forEach { println(it) }

    println("================================")

    val item4 = arrayOf(
        User("Islam", "Mohamed"),
        User("Ali", "Ahmed")
    )

    println(item4.forEach { println( it ) })

    println("================================")

    val updateUser = item4.plus(User("Osama","Mohamed"))
    updateUser.forEach { println(it) }

    println("================================")
    item4[0] = User("Foo","Bar")
    val index = item4[0]
    println(index)
    println("================================")
    item4.forEach { println(it) }



 }

class User(var fristName: String, var lastName: String) {
    var fullName = "$fristName $lastName"

    override fun toString(): String {
        return fullName
    }
}
