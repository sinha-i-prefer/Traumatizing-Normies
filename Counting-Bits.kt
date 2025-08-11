class Solution {
    fun countBits(n: Int): IntArray {
        var resList = mutableListOf<Int>()
        for(i in 0..n){
            resList.add(Integer.bitCount(i))
        }
        return resList.toIntArray()
    }
}