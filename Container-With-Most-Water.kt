class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size-1
        var max = minOf(height[left],height[right])
        while(left<right){
            val curr = minOf(height[left],height[right])
            max = maxOf(curr*(right-left),max)
            if(height[left]<height[right]){
                left++
            }
            else{
                right--
            }
        }
        return max
    }
}