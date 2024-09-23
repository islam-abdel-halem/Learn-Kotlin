// # App 1

/*
fun main(){
    println("Enter your Number1 : ")
    val Number1 = readLine()!!.toDouble()
    println("Enter your Number2 : ")
    val Number2 = readLine()!!.toDouble()
    val result = Number1 / Number2
    println(result)
    println(result.javaClass.name)
}
*/


// # App 2

fun main(){
    println("Enter your Name : ")
    val Name = readLine()!!.toString()
    val value = Name.split(' ')
    val fChar = value[0].substring(0,1)
    val lChar = value[1].substring(0,1)
    println("${fChar+lChar}")
    
}