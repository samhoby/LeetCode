class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val needleLen = needle.length
        val maxStart = haystack.length - needleLen

        for (start in 0..maxStart) {
            var matched = 0
            
            while (matched < needleLen && haystack[start+matched] == needle[matched]) matched++

            if (matched == needleLen) {
                return start
            }
        }

        return -1
    }
}
