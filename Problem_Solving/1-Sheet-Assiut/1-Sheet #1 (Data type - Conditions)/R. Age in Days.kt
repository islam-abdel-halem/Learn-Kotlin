fun main() {
    var number = readLine()!!.toInt()
    val years: Int = number/365
    number%=365
    val months: Int = number/30
    number%=30
    val days: Int = number
 
    print("$years years\n$months months\n$days days")
}