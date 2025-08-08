class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size) {
            prefix = commonPrefix(prefix, strs[i])
            if (prefix.isEmpty()) break
        }
        return prefix
    }

    fun commonPrefix(str1: String, str2: String): String {
        val limit = minOf(str1.length, str2.length)
        val result = StringBuilder()
        for (i in 0 until limit) {
            if (str1[i] == str2[i]) {
                result.append(str1[i])
            } else {
                break
            }
        }
        return result.toString()
    }
}
