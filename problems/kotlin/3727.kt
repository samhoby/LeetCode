class Solution {
    fun maxAlternatingSum(nums: IntArray): Long {
        val squaredNums = LongArray(nums.size) { nums[it].toLong() * nums[it] }
        squaredNums.sort()

        var i = 0
        val n = squaredNums.size
        var res = 0L

        while (i < n/2) {
            res -= squaredNums[i]
            i++
        }

        while (i <= n-1) {
            res += squaredNums[i]
            i++
        }
        
        return res
    }
}
