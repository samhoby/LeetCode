# Code
class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0

        for i in range(32):
            bit = (n >> i) & 1
            res = (res << 1) | bit

        return res

# Follow-up
def reverseByte(b: int) -> int:
    rev = 0

    for i in range(8):
        bit = (b >> i) & 1
        rev = (rev << 1) | bit

    return rev

class Solution:
    table = [reverseByte(b) for b in range(256)]

    def reverseBits(self, n: int) -> int:
        b0 = n & 0xFF
        b1 = (n >> 8) & 0xFF
        b2 = (n >> 16) & 0xFF
        b3 = (n >> 24) & 0xFF

        return (self.table[b0] << 24) | (self.table[b1] << 16) | (self.table[b2] << 8) | self.table[b3]
