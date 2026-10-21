class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minBuy = prices[0]
        var maxProfit = 0

        for (i in prices.indices) {
            val price = prices[i]
            val profitOfDay = price - minBuy
            
            if (price < minBuy) {
                minBuy = price
            }   

            if (profitOfDay > maxProfit) {
                maxProfit = profitOfDay
            }
        }

        return maxProfit
    }
}
