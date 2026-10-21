class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        seen = set()

        for num in nums:
            if num not in seen:
                seen.add(num)
            else:
                return True

        return False
