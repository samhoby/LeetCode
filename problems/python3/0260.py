class Solution:
    def singleNumber(self, nums: list[int]) -> list[int]:
        mask = 0

        for num in nums:
            mask ^= num

        lowestBit = mask & -mask
        first = 0

        for num in nums:
            # XOR only the group that has lowestBit, pairs cancel, one single is left
            if (num & lowestBit) != 0:
                first ^= num

        return [first, mask ^ first]
