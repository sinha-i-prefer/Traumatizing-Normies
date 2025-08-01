class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resList = mutableListOf<List<String>>()
        val map = HashMap<String, MutableList<String>>()
        for(word in strs){
            if(map.containsKey(word)){
                map[word]?.add(word)
            }
            else{
                var flag = false
                for(key in map.keys){
                    if(checkAnagram(word, key)) {
                        map[key]?.add(word)
                        flag = true
                        break
                    }
                }
                if(!flag) map[word] = mutableListOf(word)
            }
        }
        for(lists in map.values){
            resList.add(lists)
        }
        return resList
    }
    fun checkAnagram(target: String, base: String): Boolean {
        if(target.length != base.length) return false
        val compArray = IntArray(26){0}
        val compArray2 = IntArray(26){0}
        for(i in target){
            compArray[i-'a']++
        }
        for(i in base){
            compArray2[i-'a']++
        }
        return compArray.contentEquals(compArray2)
    }
}