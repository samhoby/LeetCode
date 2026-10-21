class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()
        
        for (i in nums.indices) { 
            val num = nums[i]
            val complement = target - num
            
            if (complement in seen) {
	            val j = seen[complement]
	            if (j != null) {
		            return intArrayOf(j, i)
	            }
            }
            seen[num] = i
        }
        
        return intArrayOf()
    }
}