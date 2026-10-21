class Solution {
    fun findMinMoves(machines: IntArray): Int {
        var totalDresses = 0
        for (m in machines) totalDresses += m

        val n = machines.size
        if (totalDresses % n != 0) return -1

        val dressesPerMachine = totalDresses / n
        var moves = 0
        var balance = 0

        for (m in machines) {
            val diff = m - dressesPerMachine
            balance += diff
            moves = maxOf(moves, abs(balance), diff)
        }

        return moves
    }
}