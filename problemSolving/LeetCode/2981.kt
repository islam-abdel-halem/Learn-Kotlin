class Solution {
    fun maximumLength(inputString: String): Int {
        var left = 0
        var right = inputString.length

        while (left < right) {
            val mid = (left + right + 1) shr 1
            if (isCriteriaSatisfied(inputString, mid)) {
                left = mid
            } else {
                right = mid - 1
            }
        }

        return if (left == 0) -1 else left
    }

    private fun isCriteriaSatisfied(inputString: String, targetLength: Int): Boolean {
        val frequencyCounter = IntArray(26)
        var i = 0
        val stringLength = inputString.length

        while (i < stringLength) {
            var endIndex = i + 1
            while (endIndex < stringLength && inputString[endIndex] == inputString[i]) {
                endIndex++
            }

            val charIndex = inputString[i] - 'a'
            frequencyCounter[charIndex] += maxOf(0, endIndex - i - targetLength + 1)

            if (frequencyCounter[charIndex] >= 3) {
                return true
            }

            i = endIndex
        }

        return false
    }
}