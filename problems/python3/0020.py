class Solution:
    def isValid(self, s: str) -> bool:
        if (len(s) % 2 != 0):
            return False

        stack = []

        for char in s:
            match char:
                case '(':
                    stack.append(')')
                case '[':
                    stack.append(']')
                case '{':
                    stack.append('}')
                case _:
                    if not stack or stack.pop() != char:
                        return False

        return not stack
