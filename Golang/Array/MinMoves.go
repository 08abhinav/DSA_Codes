/*
453. Minimum Moves to Equal Array Elements
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment n - 1 elements of the array by 1.*/
package main
import "fmt"

func minMoves(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	min, res := nums[0], 0
	for _, i := range nums {
		if i < min {
			min = i
		}
	}

	for _, j := range nums {
		res += j - min
	}
	return res
}

func main() {
	nums := []int{1, 2, 3}
	fmt.Println(minMoves(nums))
}