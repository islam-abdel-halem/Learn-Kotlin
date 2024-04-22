fun main() {
    //filterNotNull()
    val names = listOf("Islam", "Mohamed", "Ali", null, "Max", null)
    val test = names.filterNotNull()
    println(test) //[Islam, Mohamed, Ali, Max]

}