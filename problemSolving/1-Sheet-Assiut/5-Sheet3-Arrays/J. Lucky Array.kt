fun main() {
    val nums = mutableListOf<Long>()
    val size = readLine()!!.toInt()
    val inputString = readLine()!!.split(" ")

    for (numberString in inputString) {
        val number = numberString.toIntOrNull()
        nums.add(number!!.toLong())
    }
    var min = nums[0]
    var count = 0
    for (i in 0 until size) {
        if (nums[i] == min) {
            count++
        } else if (nums[i] < min) {
            min = nums[i]
            count = 1
        }
    }
    val isLucky = count % 2 != 0
    println(if (isLucky) "Lucky" else "Unlucky")
}