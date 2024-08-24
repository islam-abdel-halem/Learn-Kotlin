typealias AuthToken = String
fun main() {
    val user = User("islam","545HDKD5KD_JD45IDJ586")
    Order(user.authToken)
}
//data class AuthToken(val token:String)
data class Account(val authToken: AuthToken)
data class Order(val authToken:AuthToken)

