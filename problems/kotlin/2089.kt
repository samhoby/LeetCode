class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var less = 0
        var equal = 0

        for (num in nums) {
            if (num < target) less++
            if (num == target) equal++
        }

        return (less until less + equal).toList()
    }
}
