class Solution {
    fun <K, V> getKeyFromValue(map: Map<K, V>, value: V): K? {
        return map.entries.firstOrNull { it.value == value }?.key
    }
    fun isIsomorphic(s: String, t: String): Boolean {
        var left = 0
        val map = HashMap<Char, Char>()
        while(left<s.length){
            if(map.containsKey(s[left]) && map[s[left]] != t[left]){
                return false
            }
            if(map.containsValue(t[left]) && getKeyFromValue(map, t[left]) != s[left]){
                return false
            }
            map.put(s[left],t[left])
            left++
        }
        return true
    }

}