class Solution {
    fun minRemoval(nums: IntArray, k: Int): Int {
        nums.sort()
        var maxLen = Int.MIN_VALUE
        var left = 0
        for(right in nums.indices){
            while(nums[right] >k*nums[left].toLong()){
                left++
            }
            maxLen = maxOf(maxLen, right-left+1)
        }
        return nums.size-maxLen
    }
}