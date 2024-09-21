fun main() {
    // Read the number of elements
    val n = readLine()!!.toInt()

    // Read the two arrays A and B
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val b = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    // Sort both arrays
    a.sort()
    b.sort()

    // Check if they are the same after sorting
    if (a.contentEquals(b)) {
        println("yes")
    } else {
        println("no")
    }
}
