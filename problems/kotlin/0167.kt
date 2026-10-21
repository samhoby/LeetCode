class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex

        while (left < right) {
            val total = numbers[left] + numbers[right]
            when {
                total > target -> right--
                total < target -> left++
                else -> return intArrayOf(left + 1, right + 1)
            }
        }

        return intArrayOf(-1, -1)
    }
}
