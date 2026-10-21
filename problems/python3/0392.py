# Code
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        sLen = len(s)
        i = 0

        for c in t:
            if i < sLen and s[i] == c:
                i += 1

        return i == sLen

# Follow-up
class Solution:
    def isSubsequence(self, s: list[str], t: str) -> bool:
        positions = {}
        for i, c in enumerate(t):
            positions.setdefault(c, []).append(i)

        for word in s:
            prev = -1

            for c in word:
                indices = positions.get(c)
                if indices is None:
                    return False

                left = 0
                right = len(indices)

                while left < right:
                    mid = (left + right) // 2
                    if indices[mid] > prev:
                        right = mid
                    else:
                        left = mid + 1

                if left == len(indices):
                    return False
                prev = indices[left]

        return True
