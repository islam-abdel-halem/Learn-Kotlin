package `Learn-Kotlin`.Code.`#5-OOP`

fun main() {
    val obj = Info("Islam","Abdel-Halem")
    obj.favoriteCity = "Alex"
    println(obj.toString())
}

class Info(var firstName: String, var lastName: String) {
    lateinit var favoriteCity: String

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName() + "'s Favorite City is : $favoriteCity"
    }

}