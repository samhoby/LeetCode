class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        seen = [0] * 128
        i = 0

        for j, char in enumerate(s):
            code = ord(char)
            while seen[code] > 0:
                seen[ord(s[i])] -= 1
                i += 1

            seen[code] += 1
            max_len = max(max_len, j - i + 1)

        return max_len
