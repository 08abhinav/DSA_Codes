func maxProfit(prices []int)int{
	buy, profit := prices[0], 0
	for _, i := range prices{
		profit = max(profit, i - buy)
		buy = min(buy, i)
	}
	return profit
}