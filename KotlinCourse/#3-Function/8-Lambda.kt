
fun main() {

    // val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }
    val greeting: (String) -> String = { name: String -> "Hello $name" }

//    fun greeting(name: String): String{
//        return "Hello $name"
//    }
    val test = greeting("Islam")
    println(test)

    val greeting2: (String, String) -> String = { firstName: String, lastName: String ->
        "Hello $firstName $lastName"
    }
    val test2 = greeting2("Islam","Mohamed")
    println(test2)

    val greeting3= { firstName: String, lastName: String ->
        "Hello $firstName $lastName"
    }
    val test3= greeting3("Islam","Mohamed")
    println(test3)


//
//    val test = greeting("Tamer")
//    println(test)

}