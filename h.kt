class Persons {
    var age: Int = 18
        // Custom getter
        get() {
            println("Getting age value")
            return field
        }
        // Custom setter
        set(value) {
            println("Setting age value to $value")
            if (value > 0) {
                field = value  // 'field' is a keyword used to refer to the backing field of the property
            } else {
                println("Age cannot be negative")
            }
        }
}

fun main() {
    val person = Persons()

    println(person.age)  // Calls the custom getter

    person.age = 25  // Calls the custom setter

    person.age = -5  // Setter prevents negative age
}
