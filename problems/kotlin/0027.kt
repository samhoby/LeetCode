class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var j = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[j] = nums[i]
                j++
            }
        }

        return j
    }
}
