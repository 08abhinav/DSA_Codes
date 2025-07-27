/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in 
the array if you can flip at most k 0's.*/
package main

import "fmt"

func longestOne(nums []int, k int) int {
	left, zeroCount, maxLen := 0, 0, 0

	for right := 0; right < len(nums); right++ {
		if nums[right] == 0 {
			zeroCount++
		}
		for zeroCount > k {
			if nums[left] == 0 {
				zeroCount--
			}
			left++
		}

		if maxLen < right-left+1 {
			maxLen = right - left + 1
		}
	}
	return maxLen
}

func main() {
	nums := []int{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}
	k := 3
	fmt.Println(longestOne(nums, k))
}