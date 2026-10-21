class Solution {
    fun addBinary(a: String, b: String): String {
        var len1 = a.length-1
        var len2 = b.length-1
        var carry = 0
        val builder = StringBuilder()

        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            var total = carry
            
            if (len1 >= 0) {
                total += a[len1] - '0' 
                len1--
            }

            if (len2 >= 0) {
                total += b[len2] - '0'
                len2--
            }

            carry = total / 2
            builder.append(total % 2)
        }

        return builder.reverse().toString()
    }
}
