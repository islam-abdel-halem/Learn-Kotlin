fun main(){
    val radius = readLine()!!.toDouble()
    val PI = 3.141592653
    val area = PI * radius * radius
    println(String.format("%.9f", area))
}