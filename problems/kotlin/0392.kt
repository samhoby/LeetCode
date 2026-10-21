// Code
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val sLen = s.length
        var i = 0
        
        for (c in t) {
            if (i < sLen && s[i] == c) i++
        }

        return i == sLen
    }
}

// Follow-up
class Solution {
    fun isSubsequence(s: List<String>, t: String): Boolean {
        val positions = HashMap<Char, MutableList<Int>>()
        for ((i, c) in t.withIndex()) positions.getOrPut(c) { mutableListOf() }.add(i)

        for (word in s) {
            var prev = -1

            for (c in word) {
                val indices = positions[c] ?: return false

                var left = 0
                var right = indices.size
                
                while (left < right) {
                    val mid = (left + right) / 2
                    if (indices[mid] > prev) right = mid else left = mid + 1
                }

                if (left == indices.size) return false
                prev = indices[left]
            }
        }

        return true
    }
}
