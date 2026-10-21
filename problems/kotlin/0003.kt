class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLen = 0
        val seen = IntArray(128)
        var i = 0

        for (j in s.indices) {
            val code = s[j].code
            while (seen[code] > 0) {
                seen[s[i].code]--
                i++
            }

            seen[code]++
            maxLen = maxOf(maxLen, j - i + 1)
        }

        return maxLen
    }
}
