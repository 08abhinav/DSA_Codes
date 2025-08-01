package main

func Min(a, b int)int{
	if a > b{
		return b
	}
	return a
}

func minCost(cost []int)int{
	n := len(cost)
	first := cost[0]
	second := cost[1]

	for i := 2; i < n; i++{
		curr := cost[i] + Min(first, second)
		first = second
		second = curr
	}
	return Min(first, second)
}