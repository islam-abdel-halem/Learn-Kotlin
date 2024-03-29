fun main() {

    /*var name: String = "Islam"
    name = null
    print(name)*/

    var name: String? = "Islam"
    name = null
    print(name)

    println("==============================================")

    //Safe calls ?.

    var firstName: String? = "Mohamed"
    firstName = null
    var length = firstName?.length
    println(length)

    println("==============================================")

    var lastName: String? = "Tamer"
    var length2 = lastName?.length
    println(length2)

    println("==============================================")

    var lenght3 = if (lastName != null) lastName.length else 0
    println(lenght3)

    println("==============================================")

    //Elvis operator ?:
    println("Elvis operator ?:")

    var lastName2: String? = "Mohamed Tamer"
    lastName2 = null
    var length5 = if (lastName2 != null) lastName2.length else 0
    println(length5)

    var length6 = lastName2?.substring(0, 4)?.length ?: 0
    println(length6)

    println("==============================================")

    //The !! operator
    println("The !! operator")

    var name2: String? = "Mohamed Tamer"
    var length7 = name2!!.length
    println(length7)

    var sayHi: String? = "Hi!"
    var length8 = sayHi!!.length
    println(length8)
}
