fun main() {
    val num1 = readLine()!! 
    val size = num1.length 

    val num2 = num1.reversed().toCharArray() 

    val myRes1 = num1.toInt() 
    val myRes2 = String(num2).toInt() 

    println(myRes2) 
    if (myRes1 == myRes2) {
        println("YES")
    } else {
        println("NO")
    }
}
