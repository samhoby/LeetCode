class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        seen = {}
        for char in s:
            seen[char] = seen.get(char, 0) + 1

        for char in t:
            count = seen.get(char, 0) - 1

            if (count < 0):
                return False

            seen[char] = count

        return True
