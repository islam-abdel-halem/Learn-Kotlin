fun main() {

    var user = User("Islam","Mohamed")
    println(user.fullName)
    //user.fullName = "Hello World!"
    println(user.fullName)


    println("=========================")
    println("============================================")

    var user1 = User("Islam","Mohamed")
    user1.printFullName()
    println("=========================")

    var user2 = User("Islam","Mohamed")
    user2.printFullName()
    user2.updateName("Mohand")
    user2.printWithPrefix("Mr,")
    user2.firstNameLength()
    println("=========================")

    var user3 = User("Islam","Mohamed")
    user3.printFullName()
    user3.printWithPrefix("Ms,")
    user3.firstNameLength()

    println("=========================")

    val user4 = User("Mohamed")



}