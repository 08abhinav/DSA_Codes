/**Given an array arr[] containing integers and an integer k, your task is to find the length of 
 * the longest subarray where the sum of its elements is equal to the given value k. 
 * If there is no subarray with sum equal to k, return 0. */
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