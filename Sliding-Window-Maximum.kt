class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val initial = checkForMax(nums, 0, k)
        var maxLoc = initial[1]
        var max = initial[0]
        val resList = mutableListOf<Int>()
        resList.add(max)
        for(i in 1 .. nums.size-k){
            when{
                (nums[i+k-1]>max) ->{
                    max = nums[i+k-1]
                    maxLoc = i+k-1
                }
                (maxLoc < i) ->{
                    val temp = checkForMax(nums, i, k)
                    max = temp[0]
                    maxLoc = temp[1]
                }
            }
            resList.add(max)
        }
        return resList.toIntArray()
    }
    fun checkForMax(nums: IntArray, left: Int, k: Int): IntArray {
        var max = nums[left]
        var maxIndex = left
        val resArray = IntArray(2)
        
        for(i in left until left+k){
            if(nums[i] > max){
                max = nums[i]
                maxIndex = i
            }
        }        
        resArray[0] = max
        resArray[1] = maxIndex
        return resArray
    }
}