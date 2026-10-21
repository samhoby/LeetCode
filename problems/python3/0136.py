class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        singleOne = 0

        for num in nums:
            singleOne ^= num

        return singleOne
