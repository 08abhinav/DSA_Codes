/*2348. Number of Zero-Filled Subarrays
Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.*/
package main

import "fmt"

func zeroFilledSub(nums []int) int64 {
	var count, ans int64
	count, ans = 0, 0
	for _, val := range nums {
		if val == 0 {
			count++
			ans += count
		} else {
			count = 0
		}
	}
	return ans
}

func main() {
	num := []int{1, 3, 0, 0, 2, 0, 0, 4}
	fmt.Println(zeroFilledSub(num))
}