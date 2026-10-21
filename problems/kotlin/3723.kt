class Solution {
    fun maxSumOfSquares(num: Int, sum: Int): String {
        if (sum > num * 9) return ""

        val nines = sum / 9
        val remainder = sum % 9

        val arr = CharArray(num) { i ->
            when {
                i < nines -> '9'
                i == nines && remainder > 0 -> '0' + remainder
                else -> '0'
            }
        }

        return String(arr)
    }
}
