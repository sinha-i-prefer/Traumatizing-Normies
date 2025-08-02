class Solution {
    fun minCost(basket1: IntArray, basket2: IntArray): Long {
        val map1 = HashMap<Long, Long>()
        val map2 = HashMap<Long, Long>()
        for(i in basket1.indices){
            map1[basket1[i].toLong()] = map1.getOrDefault(basket1[i].toLong(), 0L) + 1
            map2[basket2[i].toLong()] = map2.getOrDefault(basket2[i].toLong(), 0L) + 1
        }
        val totalEls = (map1.keys+map2.keys).toSet()
        for(key in totalEls){
            val total = map1.getOrDefault(key, 0L) + map2.getOrDefault(key, 0L)
            if(total%2 != 0L){
                return -1
            }
        }
        val toSwap1 = mutableListOf<Long>()
        val toSwap2 = mutableListOf<Long>()
        for(key in totalEls){
            val t1 = map1.getOrDefault(key, 0)
            val t2 = map2.getOrDefault(key, 0)
            val total =  t1+t2
            val limit = total/2
            if(t1>limit){
                for(i in 0 until t1-limit){
                    toSwap1.add(key)
                }
            }
            if(t2>limit){
                for(i in 0 until t2-limit){
                    toSwap2.add(key)
                }
            }
        }
        toSwap1.sort()
        toSwap2.sortDescending()
        val minV = totalEls.minOrNull()?:0
        var result = 0L
        for(h in toSwap1.indices){
            val swap1 = minOf(toSwap1[h],toSwap2[h])
            result += minOf(swap1, 2*minV)
        }
        return result
    } 
}
