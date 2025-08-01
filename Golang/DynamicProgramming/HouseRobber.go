/*
198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a 
certain amount of money stashed, the only constraint stopping you from robbing each of 
them is that adjacent houses have security systems connected and it will automatically 
contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the 
maximum amount of money you can rob tonight without alerting the police.
*/
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
		prev = max(prev2 + nums[i], prev)
		prev2 = temp
	}
	return prev
}

// func main() {
// 	nums := []int{1, 2}
// 	fmt.Println(rob(nums))
// }