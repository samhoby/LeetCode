class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2
            val value = nums[mid]

            when {
                value == target -> return mid
                nums[left] <= value -> {
                    if (target in nums[left] until value) right = mid - 1
                    else left = mid + 1
                }
                else -> {
                    if (target in (value+1)..nums[right]) left = mid + 1
                    else right = mid - 1
                }
            }
        }

        return -1
    }
}
