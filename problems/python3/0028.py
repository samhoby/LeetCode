class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        needleLen = len(needle)
        maxStart = len(haystack) - needleLen

        for start in range(maxStart+1):
            matched = 0

            while matched < needleLen and haystack[start+matched] == needle[matched]:
                matched += 1

            if matched == needleLen:
                return start

        return -1
