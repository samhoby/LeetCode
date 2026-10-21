class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        ones, twos = 0, 0

        for n in nums:
            ones = (ones ^ n) & ~twos
            twos = (twos ^ n) & ~ones

        return ones
