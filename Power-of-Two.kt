class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        val n = n.toLong()
        return n != 0L && n and (n - 1) == 0L
    }
}