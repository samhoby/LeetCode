class Solution:
    # REMINDER: ord('0') = 48
    def addBinary(self, a: str, b: str) -> str:
        len1 = len(a) - 1
        len2 = len(b) - 1
        carry = 0
        res = []

        while len1 >= 0 or len2 >= 0 or carry:
            total = carry

            if len1 >= 0:
                total += ord(a[len1]) - 48
                len1 -= 1

            if len2 >= 0:
                total += ord(b[len2]) - 48
                len2 -= 1

            carry = total // 2
            res.append(str(total % 2))

        return "".join(reversed(res))
