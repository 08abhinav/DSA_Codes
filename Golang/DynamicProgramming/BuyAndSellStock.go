func maxProfit(prices []int)int{
	buy, profit := prices[0], 0
	for _, i := range prices{
		profit = max(profit, i - buy)
		buy = min(buy, i)
	}
	return profit
}

func max(a, b int)int{
	if a > b{
		return a
	}
	return b
}

func min(a, b int)int{
	if a < b{
		return a
	}
	return b
}