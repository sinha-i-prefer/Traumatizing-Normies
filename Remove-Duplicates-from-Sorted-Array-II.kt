class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var curr = nums[0]
        var currC = 1
        var count = 0
        for(i in 1 until nums.size){
            if(nums[i]==curr){
                currC++
                if(currC>2){
                    nums[i]=-10001
                    count++
                }
            }
            else{
                currC=1
                curr = nums[i]
            }
        }
        var currShf = 0
        for(right in nums.indices){
            if(nums[right]==-10001){
                currShf++
            }
            else{
                var temp = nums[right]
                nums[right-currShf] = temp
                if(currShf>0) nums[right] = -10001
            }
        }
        return nums.size-count
    }
}