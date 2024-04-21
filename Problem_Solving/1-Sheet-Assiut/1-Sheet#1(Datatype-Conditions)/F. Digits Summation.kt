fun main(){
    val (Number1, Number2) = readLine()!!.split(" ").map { it.toLong()%10 }
    println(Number1 + Number2)
}