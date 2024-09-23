package KotlinCourse.`#5-OOP`.lazy

fun main() {
    val obj:Test by lazy {
        println("Test")
        Test("islam")
    }
    println(obj)
    println(obj.toString())
    println(obj)
    println(obj.toString())
}

class Test(val name:String){
    init {
        println("Hi $name")
    }
}