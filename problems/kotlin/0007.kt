class Solution {
    fun reverse(x: Int): Int {
        var value = x
        var res = 0L

        while (value != 0) {
            res = res * 10 + value % 10
            value /= 10
        }

        return if (res in Int.MIN_VALUE..Int.MAX_VALUE) res.toInt() else 0
    }
}
