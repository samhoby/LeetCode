class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x < 0 else 1
        value = abs(x)
        res = 0

        while value != 0:
            res = res * 10 + value % 10
            value //= 10

        res *= sign
        return res if -2**31 <= res <= 2**31-1 else 0
