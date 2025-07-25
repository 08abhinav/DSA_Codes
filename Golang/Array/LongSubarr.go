package main

import "fmt"

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func longestSubarr(arr []int, k int) int {
	res := 0
	for i := 0; i < len(arr); i++ {
		sum := 0
		for j := i; j < len(arr); j++ {
			sum += arr[j]

			if sum == k {
				subLen := j - i + 1
				res = max(res, subLen)
			}
		}
	}
	return res
}

func main() {
	arr := []int{10, 5, 2, 7, 1, -10}
	fmt.Println(longestSubarr(arr, 15))
}