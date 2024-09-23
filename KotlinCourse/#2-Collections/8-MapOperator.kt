
fun main() {
    val items = listOf("Islam Mohamed", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result = items.map { it.substring(0, 3).uppercase() }
    println(result)  // [ISL, AHM, OSA, KHA]

    println("=================================")

    val result2 = items.map { "Foo" } // replace all = [Foo, Foo, Foo, Foo]
    println(result2)

    println("=================================")

    val items2 = listOf("Islam Mohamed", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result3 = items2.map {
        val words = it.split(' ')
        words[0].substring(0, 1) + words[1].substring(0, 1)
    }
    println(result3)  // [IM, AA, OM, KA]

    println("=================================")

    val items3 = listOf("Islam Mohamed", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result4 = items3.map { it.substring(0, 3).uppercase() }
        .reversed()
    println(result4)  // [KHA, OSA, AHM, ISL]
    
}