class Solution:
    def minInsertions(self, s: str) -> int:
        sLen = len(s)
        stack = []
        count = 0
        i = 0

        while i < sLen:
            if s[i] == '(':
                stack.append(s[i])
                i += 1
                continue

            if i + 1 < sLen and s[i + 1] == ')':
                i += 2
            else:
                i += 1
                count += 1

            if not stack:
                count += 1
            else:
                stack.pop()

        return count + len(stack) * 2
