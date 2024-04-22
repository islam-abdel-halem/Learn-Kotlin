
fun main() {
//    val item = listOf(1,2,3,4,5)
//    item.add

    val item = mutableListOf(1,2,3,4,5)
    item.forEach { println(it) }
    println("==========================")
    item.add(6)
    item.forEach { println(it) }
    println("==========================")
    item.add(6,50)  // using index
    item.forEach { println(it) }
    println("==========================")
    item.remove(50)
    item.forEach { println(it) }
    println("==========================")
    item.removeAt(5)  // using index
    item.forEach { println(it) }

    println("==========================")

    val item2 = mutableListOf(
        User("Islam","Mohamed"),
        User("Ahmed","Mohamed")
    )
    item2.forEach { println(it) }
    println("==========================")
    item2.removeAt(0)   // using index
    item2.forEach { println(it) }
    println("==========================")
    item2[0] = User("Mohand","Tamer")
    item2.forEach { println(it) }


}

class User(var fristName: String, var lastName: String) {
    var fullName = "$fristName $lastName"

    override fun toString(): String {
        return fullName
    }
}