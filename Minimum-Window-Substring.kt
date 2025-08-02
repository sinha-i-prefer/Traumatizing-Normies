class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.length == 0 || t.length == 0 || s.length < t.length) {
            return ""
        }
        val map = HashMap<Char, Int>()
        var stInx = 0
        var size = Int.MAX_VALUE
        var helpCount = t.length
        for(char in t){
            map[char] = map.getOrDefault(char, 0) + 1
        }
        var left = 0
        for(right in s.indices){
            if(map.containsKey(s[right])) {
                map[s[right]] = map[s[right]]!! - 1
                if(map[s[right]]!! >= 0) {
                    helpCount--
                }
            }         
            while(helpCount==0){
                if(right-left+1 < size){
                    stInx = left
                    size = right-left+1
                }
                
                if(map.containsKey(s[left])){
                    map[s[left]] = map[s[left]]!! + 1
                    if(map[s[left]]!! > 0){
                        helpCount++
                    }
                }
                left++
            }
        }
        if(size == Int.MAX_VALUE) {
            return ""
        }        
        return s.substring(stInx, stInx + size)
    }
}