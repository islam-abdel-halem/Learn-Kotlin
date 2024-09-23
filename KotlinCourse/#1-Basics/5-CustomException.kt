

fun main() {
   //How to Create a Custom Exception in Kotlin
   val p = User("islam", 20.toString())
   if (p.age < 21) {
       throw InvalidException(p.age,"User is not old enough!")
   }

}
