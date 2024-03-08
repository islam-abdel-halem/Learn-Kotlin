fun main() {


    
    val age:Any = 1.0

    val obj:Any = Person("Tamer")
    if (obj is String) {
        println("Its is!")

    }else {
        println("It is Not!")
        println(obj.javaClass.name)
    }
}