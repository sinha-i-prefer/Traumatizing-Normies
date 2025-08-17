class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var curr = 0
        for(i in arr){
            if (i % 2 != 0) { 
                curr++
                if (curr == 3) return true
            } else {
                curr = 0
            }
        }
        return false
    }
}