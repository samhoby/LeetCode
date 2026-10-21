class Solution {
    fun fizzBuzz(n: Int): List<String> =
        List(n) { i ->
            val num = i+1
            
            when {
                num % 15 == 0 -> "FizzBuzz"
                num % 3 == 0 -> "Fizz"
                num % 5 == 0 -> "Buzz"
                else -> "$num"
            } 
        }
}
