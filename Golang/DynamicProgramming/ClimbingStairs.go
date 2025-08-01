/* 70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */
package main

// import "fmt"

func climbStairs(n int) int {
	if n == 3 {
		return n
	}

	prev1, prev2, curr := 3, 2, 0
	for i := 3; i < n; i++ {
		curr = prev1 + prev2
		prev2 = prev1
		prev1 = curr
	}
	return curr
}

// func main() {
// 	n := 8
// 	fmt.Println(climbStairs(n))
// }