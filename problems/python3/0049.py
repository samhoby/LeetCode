class Solution:
    # REMINDER: ord('a') = 97
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        # dict[bytes, list[str]]
        groups = {}

        for s in strs:
            counts = [0] * 26

            for c in s:
                counts[ord(c) - 97] += 1

            groups.setdefault(bytes(counts), []).append(s)

        return list(groups.values())
