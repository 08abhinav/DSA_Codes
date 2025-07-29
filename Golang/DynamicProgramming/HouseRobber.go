package main

import "fmt"

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func rob(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	prev, prev2 := 0, 0

	for i := 0; i < len(nums); i++ {
		temp := prev
		prev = max(prev2+nums[i], prev)
		prev2 = temp
	}
	return prev
}

func main() {
	nums := []int{1, 2}
	fmt.Println(rob(nums))
}