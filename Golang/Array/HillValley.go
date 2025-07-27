package main

import "fmt"

func countHillValley(nums []int) int {
	res, left := 0, 0

	for i := 1; i < len(nums)-1; i++ {
		if nums[i] != nums[i+1] {
			if nums[i] > nums[left] && nums[i] > nums[i+1] ||
				nums[i] < nums[left] && nums[i] < nums[i+1] {
				res++
			}
			left = i
		}
	}
	return res
}

func main() {
	nums := []int{2, 4, 1, 1, 6, 5}
	fmt.Println(countHillValley(nums))
}