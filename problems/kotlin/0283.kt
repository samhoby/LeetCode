class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0

        for (j in nums.indices) {
            if (nums[j] != 0) {
                if (i != j) exchange(nums, i, j)
                i++
            }
        }
    }

    private fun exchange(nums: IntArray, i: Int, j: Int): Unit {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp 
    }
}
