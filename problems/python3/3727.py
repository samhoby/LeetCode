class Solution:
    def maxAlternatingSum(self, nums: list[int]) -> int:
        squaredNums = sorted(num * num for num in nums)
        half = len(squaredNums) // 2

        return sum(squaredNums[half:]) - sum(squaredNums[:half])
