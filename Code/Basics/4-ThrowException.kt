fun main() {

    val p = PersonInfo("islam",20)
    if (p.age < 21) {
        throw Exception("User is not old enough!")
    }

}

data class PersonInfo(val name: String, val age:Int)