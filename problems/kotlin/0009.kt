class Solution {
    fun isPalindrome(x: Int): Boolean {
        // negative or ends with 0 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) return false
        
        var num = x
        var reversed = 0
        
        // reverse only half of the number
        while (num > reversed) {
	        // write last digit of num to reversed
            reversed = reversed * 10 + num % 10
            // remove last digit of num
            num /= 10 
        }
        // even size (1221) || odd size (121)
        return num == reversed || num == reversed / 10 
    }
}
