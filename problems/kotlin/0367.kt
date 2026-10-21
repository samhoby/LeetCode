class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        val numLong = num.toLong()
        var left = 1L
        var right = numLong
        
        while (left <= right) {
            val mid = (left + right) / 2
            val square = mid * mid
            
            when {
                square == numLong -> return true
                square < numLong -> left = mid + 1
                else -> right = mid - 1
            }            
        }
        
        return false
    }
}
