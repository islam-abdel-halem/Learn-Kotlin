package KotlinCourse.`#5-OOP`.lazy

fun main() {
    //Lateinit VS Lazy

//    val obj = MyInfo()
//    println(obj.getValue())

    val obj = MyInfo()
    obj.setValue("islam")
    println(obj.getValue())
    println(obj.getValue())

}

class MyInfo() {
    //    val myName:String? = null
    lateinit var myName:String

    fun setValue(name:String) {
        myName = name
    }
//    fun getValue() = myName

    fun getValue() = if (::myName.isInitialized) myName else "Not initialized"
}