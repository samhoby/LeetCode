class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x
        
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (mid.toLong() * mid <= x) left = mid + 1 else right = mid - 1
        }
        
        return right
    }
}
