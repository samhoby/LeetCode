class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        combinations, solution = [], []

        def backtrack(left, right):
            if (len(solution) == 2 * n):
                combinations.append("".join(solution))
                return

            if (left < n):
                solution.append("(")
                backtrack(left + 1, right)
                solution.pop()

            if (left > right):
                solution.append(")")
                backtrack(left, right + 1)
                solution.pop()

        backtrack(0, 0)
        return combinations
