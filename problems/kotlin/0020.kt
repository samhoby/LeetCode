class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false

        val stack = Stack<Char>()

        for (char in s) {
            when (char) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                else -> if (stack.isEmpty() || stack.pop() != char) return false
            }
        }

        return stack.isEmpty()
    }
}
