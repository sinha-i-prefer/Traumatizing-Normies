class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val opRay = baskets.copyOf()
        var count = 0
        for(right in fruits.indices){
            var left = 0
            for(i in opRay.indices){
                if(opRay[i]>=fruits[right]){
                    opRay[i]=-1
                    left = 1
                    break
                }
            }
            if(left !=1) count++
        }
        return count
    }
}