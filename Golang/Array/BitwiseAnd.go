/*2419. Longest Subarray With Maximum Bitwise AND
You are given an integer array nums of size n.

Consider a non-empty subarray from nums that has the maximum possible bitwise AND.

In other words, let k be the maximum value of the bitwise AND of any subarray of nums. 
Then, only subarrays with a bitwise AND equal to k should be considered. Return the 
length of the longest such subarray.

The bitwise AND of an array is the bitwise AND of all the numbers in it.

A subarray is a contiguous sequence of elements within an array.*/
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

func main() {
	nums := []int{1, 2, 3, 3, 2, 2}
	fmt.Println(longestSubarray(nums))
}