package main

import "fmt"

func findMaxForm(strs []string, m int, n int) int {
	dp := make([][]int, m+1)
	for i := range dp {
		dp[i] = make([]int, n+1)
	}

	for _, s := range strs {
		zeros, ones := countBits(s)

		for i := m; i >= zeros; i-- {
			for j := n; j >= ones; j-- {
				if dp[i-zeros][j-ones]+1 > dp[i][j] {
					dp[i][j] = dp[i-zeros][j-ones] + 1
				}
			}
		}
	}
	return dp[m][n]
}
func countBits(s string) (int, int) {
	zeros, ones := 0, 0
	for _, i := range s {
		if i == '0' {
			zeros += 1
		} else {
			ones += 1
		}
	}
	return zeros, ones
}

func main() {
	strs := []string{"10", "0001", "111001", "1", "0"}
	m, n := 5, 3
	fmt.Println(findMaxForm(strs, m, n))
}