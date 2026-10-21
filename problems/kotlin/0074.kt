class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size

        var left = 0
        var right = (m * n) - 1      

        while (left <= right) {
            val mid = (left + right) / 2
            // matrix[row][col]
            val elem = matrix[mid / n][mid % n]
            when {
                elem == target -> return true
                elem < target -> {
                    left = mid + 1
                }
                else -> {
                    right = mid - 1
                }
            }
        }

        return false
    }
}
