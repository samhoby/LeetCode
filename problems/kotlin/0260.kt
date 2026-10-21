class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        var mask = 0
        // mask ^= num
        for (num in nums) mask = mask xor num   

        val lowestBit = mask.takeLowestOneBit() 
        var first = 0

        for (num in nums) {
            // XOR only the group that has lowestBit, pairs cancel, one single is left
            if ((num and lowestBit) != 0) first = first xor num
        }

        return intArrayOf(first, mask xor first)
    }
}
