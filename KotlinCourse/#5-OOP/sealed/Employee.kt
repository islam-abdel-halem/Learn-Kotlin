package KotlinCourse.`#5-OOP`.sealed

sealed class Employee
data class Manager(val name:String, val age:Int, val team:Int):Employee()
class SeniorDev(val name:String, val age:Int, val projects:Int):Employee()
object JuniorDev:Employee()


//sealed class Employee {
//    data class Manager(val name:String, val age:Int, val team:Int):Employee()
//    class SeniorDev(val name:String, val age:Int, val projects:Int):Employee()
//    object JuniorDev:Employee()
//}