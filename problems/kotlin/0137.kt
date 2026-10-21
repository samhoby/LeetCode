class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ones = 0
        var twos = 0

        for (n in nums) {
            ones = (ones xor n) and twos.inv()
            twos = (twos xor n) and ones.inv()
        }

        return ones
    }
}
