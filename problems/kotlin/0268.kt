class Solution {
    fun missingNumber(nums: IntArray): Int {
        var res = nums.size
        for (i in nums.indices) res = res xor i xor nums[i]
        return res
    }
}
