
package main

import "fmt"

func Max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func longestSubarray(nums []int) int {
	maxLen, currLen, maxVal := 0, 0, 0

	for i := 0; i < len(nums); i++ {
		maxVal = Max(maxVal, nums[i])
	}

	for i := 0; i < len(nums); i++ {
		if nums[i] == maxVal {
			currLen++
			maxLen = Max(maxLen, currLen)
		}
	}
	return maxLen
}


// func main() {
// 	nums := []int{1, 2, 3, 3, 2, 2}
// 	fmt.Println(longestSubarray(nums))
// }