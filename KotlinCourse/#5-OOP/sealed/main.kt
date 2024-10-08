package KotlinCourse.`#5-OOP`.sealed

fun main() {
    val employee:Employee = Manager("islam", 21, 10)
    val message = when(employee) {
        is Manager -> {
            "Welcome ${employee.name}! You have ${employee.team} employees in your team!"
        }
        is SeniorDev -> {
            "Welcome ${employee.name}! You have already ${employee.projects} projects under your belt!"
        }
        JuniorDev-> {"Welcome aboard! We wish you an awesome Experience!"}
    }

    println(message)
}