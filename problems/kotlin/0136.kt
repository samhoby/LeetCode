class Solution {
    fun singleNumber(nums: IntArray): Int {
        var singleOne = 0

        for (num in nums) {
            singleOne = singleOne xor num
        }

        return singleOne
    }
}
