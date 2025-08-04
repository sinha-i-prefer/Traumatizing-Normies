class Solution {
    fun totalFruit(fruits: IntArray): Int {
        val map = HashMap<Int, Int>()
        var left = 0
        var max = 0
        for(right in fruits.indices){
            map[fruits[right]] = map.getOrDefault(fruits[right], 0)+1
            while(map.size > 2){
                map[fruits[left]] = map[fruits[left]]!!-1
                if(map[fruits[left]] == 0){
                    map.remove(fruits[left])
                }
                left++
            }
            max = maxOf(right-left+1, max)
        }
        return max
    }
}