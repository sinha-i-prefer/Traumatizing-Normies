class Solution {
    fun maximum69Number(num: Int): Int {
        val numArray = num.toString().toCharArray()
        
        for (i in numArray.indices) {
            if (numArray[i] == '6') {
                numArray[i] = '9'
                break
            }
        }
        
        return String(numArray).toInt()
    }
}
