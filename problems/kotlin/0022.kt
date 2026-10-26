class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val combinations = mutableListOf<String>()
        val solution = StringBuilder("")

        fun backtrack(left: Int, right: Int) {
            if (solution.length == n * 2) {
                combinations.add(solution.toString())
                return
            }

            if (left < n) {
                solution.append('(')
                backtrack(left + 1, right)
                solution.deleteCharAt(solution.length - 1)
            }

            if (left > right) {
                solution.append(')')
                backtrack(left, right + 1)
                solution.deleteCharAt(solution.length - 1)
            }
        }

        backtrack(0, 0)
        return combinations
    }
}
