class Solution {
    private val romanValues = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var res = 0
        var prev = 0 

        for (i in s.lastIndex downTo 0) {
            val curr = romanValues[s[i]]!!

            if (curr < prev) res -= curr else res += curr

            prev = curr
        }

        return res
    }
}