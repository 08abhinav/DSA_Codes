package main

import "fmt"

func minDeletion(strs []string) int {
	m, n, count := len(strs), len(str[0]), 0

	for col := 0; col < n; col++ {
		for row := 0; row < m-1; row++ {
			if strs[row][col] > strs[row+1][col] {
				count += 1
				break
			}
		}
	}
	return count
}

func main() {
	strs := []string{"cba","daf","ghi"}
	fmt.Println(minDeletion(strs))
}