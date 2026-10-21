class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 0

        for (num in nums) {
            if (count == 0) candidate = num
            if (candidate == num) count++ else count--
        }
        
        return candidate
    }
}
