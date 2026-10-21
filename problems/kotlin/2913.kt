class Solution {
    fun sumCounts(nums: List<Int>): Int {
        var res = 0

        for (i in nums.indices) {
            val seen = HashSet<Int>()
            for (j in i until nums.size) {
                seen.add(nums[j])
                res += seen.size * seen.size
            }
        }

        return res
    }
}
