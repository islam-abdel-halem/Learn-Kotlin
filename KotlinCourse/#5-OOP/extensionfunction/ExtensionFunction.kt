package KotlinCourse.`#5-OOP`.extensionfunction

fun main() {
    val name = "Mohamed Tamer"
    println(name.initials())

    val age = 25
    println(age.isAdult())

    val person = Person("Mohamed Tamer",25)
    println(person.name.initials())
    println(person.fullName())
}


class Person(val name:String,val age:Int)