class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val sums = ArrayList<List<Int>>()
        val lastIndex = nums.lastIndex

        for (i in 0 until lastIndex - 1) {
            // 1. if the first number is already positive, the sum is never 0
            if (nums[i] > 0) break
            // 2. if the first number equals the previous one, skip it
            if (i > 0 && nums[i] == nums[i - 1]) continue

            var j = i + 1
            var k = lastIndex

            while (j < k) {
                val total = nums[i] + nums[j] + nums[k]
                when {
                    total < 0 -> j++
                    total > 0 -> k--
                    else -> {
                        // 3. add, move both pointers and skip equal values (like step 2)
                        sums.add(listOf(nums[i], nums[j], nums[k]))
                        j++
                        k--
                        while (j < k && nums[j] == nums[j - 1]) j++
                        while (j < k && nums[k] == nums[k + 1]) k--
                    }
                }
            }
        }
        return sums
    }
}