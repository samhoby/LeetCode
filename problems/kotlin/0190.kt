// Code
class Solution {
    fun reverseBits(n: Int): Int {
        var res = 0
        
        for(i in 0..31) {
            // bit = (n >> i) & 1
            val bit = n.ushr(i).and(1)
            // res = (res << 1) | bit
            res = res.shl(1).or(bit)
        }

        return res
    }
}

// Follow-up
fun reverseByte(b: Int): Int {
    var rev = 0

    for (i in 0..7) {
        // bit = (b >> i) & 1
        val bit = b.ushr(i).and(1)
        // rev = (rev << 1) | bit
        rev = rev.shl(1).or(bit)
    }

    return rev
}

class Solution {
    companion object {
        private val table = IntArray(256) { b -> reverseByte(b) }
    }

    fun reverseBits(n: Int): Int {
        val b0 = n.and(0xFF)
        val b1 = n.ushr(8).and(0xFF)
        val b2 = n.ushr(16).and(0xFF)
        val b3 = n.ushr(24).and(0xFF)

        return table[b0].shl(24)
            .or(table[b1].shl(16))
            .or(table[b2].shl(8))
            .or(table[b3])
    }
}
