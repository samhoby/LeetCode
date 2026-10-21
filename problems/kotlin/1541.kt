class Solution {
    fun minInsertions(s: String): Int {
        val stack = Stack<Char>()
        var count = 0
        var i = 0
        
        while (i < s.length) {
            if (s[i] == '(') {
                stack.push(s[i])
                i++
                continue
            }
            
            if (i + 1 < s.length && s[i + 1] == ')') {
                i += 2
            } else {
                i += 1
                count++
            }
            
            if (stack.isEmpty()) count++ else stack.pop()  
        }
            
        return count + stack.size * 2
    }
}
