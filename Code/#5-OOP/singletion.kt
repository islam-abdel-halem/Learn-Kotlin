package `Learn-Kotlin`.Code.`#5-OOP`

fun main() {
    // class make 1 Instance only
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.list.add("Salt")
    println(FavoriteFood.list.first())
    doStuff()
    println(FavoriteFood.name)
}

fun doStuff() {
    FavoriteFood.name = "Chicken"
}
object FavoriteFood {
    var name = "null"
    var list = mutableListOf<String>()
}
