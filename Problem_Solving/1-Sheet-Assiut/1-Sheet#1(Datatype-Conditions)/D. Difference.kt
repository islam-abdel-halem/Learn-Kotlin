fun main(){
    val values = readLine()!!.split(' ')
    val A = values[0].toLong()
    val B = values[1].toLong()
    val C = values[2].toLong()
    val D = values[3].toLong()

    val result = (A * B) - (C * D)
    println("Difference = $result")
}