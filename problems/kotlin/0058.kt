class Solution {
    fun lengthOfLastWord(s: String): Int {
        var i = s.lastIndex
        while (s[i] == ' ') i--
        
        var length = 0
        while (i >= 0 && s[i] != ' ') {
            length++
            i--
        }
        
        return length
    }
}
