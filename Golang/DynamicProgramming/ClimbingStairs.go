package main

func climbStairs(n int)int {
	if n == 3{
		return n
	}

	prev1 := 3
	prev2 := 2
	curr := 0
	for i := 3; i < n; i++{
		curr = prev1 + prev2
		prev2 = prev1
		prev1 = curr
	}
	return curr
}
