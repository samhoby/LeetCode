class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()

        // common difference
        val d = arr[1] - arr[0] 

        for (i in 2..arr.lastIndex) {
            if (arr[i] - arr[i - 1] != d) return false
        }

        return true
    }
}
