class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val seen = mutableMapOf<Int, Int>()
        
        // Code points allow use of Unicode characters (😀)
        for (cp in s.codePoints()) seen[cp] = (seen[cp] ?: 0) + 1

        for (cp in t.codePoints()) {
            val count = (seen[cp] ?: 0) - 1
            if (count < 0) return false
            seen[cp] = count
        }        

        return true
    }
}
