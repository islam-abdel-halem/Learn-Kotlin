package `Learn-Kotlin`.Code.`#5-OOP`

fun main() {
    val obj = Nested()
    obj.sayHi = "Hi!"
    val obj1 = obj.NestedTwo()
    obj1.info() // Hi! This is a Nested class Two
    println("===================")
    val obj2 = Nested.NestedThree()
    obj2.info() // This is a Nested class Three
}


class Nested {
    var sayHi: String = ""
    // A nested class marked as inner can access the members of its outer class.
    // Inner classes carry a reference to an object of an outer class:
    inner class NestedTwo {
        var name: String = "$sayHi This is a Nested class Two"
        fun info() = println(name)
    }

    class NestedThree {
        var name: String = "This is a Nested class Three"
        fun info() = println(name)
    }
}