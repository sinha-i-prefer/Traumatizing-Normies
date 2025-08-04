class Solution {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        var left = 0
        var right = 0
        var max = 0
        val map = TreeMap<Int, Int>()
        for(right in nums.indices){
            map[nums[right]] = map.getOrDefault(nums[right],0) +1
            while(map.lastKey() - map.firstKey() > limit){
                map[nums[left]] = map[nums[left]]!!-1
                if(map[nums[left]]== 0){
                    map.remove(nums[left])
                }
                left++
            }
            max = maxOf(max, right-left+1)
        }
        return max
    }
}