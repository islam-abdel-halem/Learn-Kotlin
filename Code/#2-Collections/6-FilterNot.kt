
fun main() {

    // FilterNot
    val names = listOf("Islam", "Mohamed", "Ahmed", "Ali", "Osama", "Mohamed")
    val FilterNot = names.filterNot { it.contains("A") }
    println(FilterNot)

}