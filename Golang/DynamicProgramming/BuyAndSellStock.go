/*121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
package main

import "fmt"

func maxProfit(prices []int) int {
	buy, profit := prices[0], 0
	for _, i := range prices {
		profit = max(profit, i-buy)
		buy = min(buy, i)
	}
	return profit
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func main() {
	prices := []int{10, 1, 5, 3, 6, 4}
	fmt.Println(maxProfit(prices))
}