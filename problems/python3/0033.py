class Solution:
    def search(self, nums: list[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2
            value = nums[mid]

            if value == target:
                return mid
            elif nums[left] <= value:
                if nums[left] <= target < value:
                    right = mid - 1
                else:
                    left = mid + 1
            else:
                if value < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
                    
        return -1
