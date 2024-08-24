//1- How to Cast in Kotlin - Kotlin Type Casting (as)
//2- Kotlin Safe Casting with 'as?'


fun main(){

    val obj:Any = getStuff("1")
    // val test = obj as Boolean       // 1
    val test = obj as? Boolean         // 2
    println(test)
    println(test?.javaClass?.name)
}

fun getStuff(value:String):Any {
    return when(value) {
        "1" -> 99
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}

