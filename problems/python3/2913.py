class Solution:
    def sumCounts(self, nums: list[int]) -> int:
        res = 0

        for i in range(len(nums)):
            seen = set()
            for j in range(i, len(nums)):
                seen.add(nums[j])
                res += len(seen) ** 2

        return res
