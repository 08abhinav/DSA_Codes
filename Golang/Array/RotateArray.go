/*189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
package main

import "fmt"

func rotate(nums []int, k int) {
	n := len(nums)
	temp := make([]int, n)
	for i := 0; i < n; i++ {
		temp[(i+k)%n] = nums[i]
	}

	for i := 0; i < n; i++ {
		nums[i] = temp[i]
	}
}

func main() {
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8}
	k := 4
	rotate(nums, k)
	fmt.Print(nums)
}