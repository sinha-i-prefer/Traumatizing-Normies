class Solution {
    fun largestGoodInteger(num: String): String {
        val hasTriplet = BooleanArray(10) { false }
        var count = 0
        for (right in 1 until num.length) {
            if (num[right] == num[right - 1]) {
                count++
                if (count == 2) {
                    hasTriplet[num[right] - '0'] = true
                }
            } else {
                count = 0
            }
        }
        for (i in 9 downTo 0) {
            if (hasTriplet[i]) {
                return "$i$i$i"
            }
        }
        return ""
    }
}