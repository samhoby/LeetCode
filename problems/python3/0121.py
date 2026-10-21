class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        minBuy = prices[0]
        maxProfit = 0

        for price in prices:
            profitOfDay = price - minBuy

            if price < minBuy:
                minBuy = price

            if profitOfDay > maxProfit:
                maxProfit = profitOfDay

        return maxProfit
