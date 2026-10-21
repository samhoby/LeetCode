class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = HashSet<Int>()
        
        for (i in nums.indices) {
            when {
                !seen.add(nums[i]) -> return true
                seen.size > k -> seen.remove(nums[i - k])
            }
        }
        
        return false
    }
}
