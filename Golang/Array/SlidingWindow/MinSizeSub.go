/**Given an array of positive integers nums and a positive integer target, 
 * return the minimal length of a subarray whose sum is greater than or equal to target. 
 * If there is no such subarray, return 0 instead. */
package main

import "fmt"

func minSubarray(nums []int, target int) int {
	left, sum := 0, 0
	minLen := len(nums) + 1

	for right := 0; right < len(nums); right++ {
		sum += nums[right]

		for sum >= target {
			if right-left+1 < minLen {
				minLen = right - left + 1
			}
			sum -= nums[left]
			left++
		}
	}
	if minLen == len(nums)+1 {
		return 0
	}
	return minLen
}

func main() {
	nums := []int{2, 3, 1, 2, 4, 3}
	fmt.Println(minSubarray(nums, 7))
}
