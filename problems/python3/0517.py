class Solution:
    def findMinMoves(self, machines: list[int]) -> int:
        totalDresses = sum(machines)

        n = len(machines)
        if totalDresses % n != 0:
            return -1

        dressesPerMachine = totalDresses // n
        moves = 0
        balance = 0

        for m in machines:
            diff = m - dressesPerMachine
            balance += diff
            moves = max(moves, abs(balance), diff)

        return moves
