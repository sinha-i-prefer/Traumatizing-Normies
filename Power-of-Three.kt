class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        val resSet = mutableSetOf<Double>()
        val base = 3.0
        var i = 1.0
        while(i < 21){
            resSet.add(base.pow(i))
            i++
        }
        resSet.add(1.0)
        if(n.toDouble() in resSet) return true
        return false
    }
}