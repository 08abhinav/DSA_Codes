/*53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.*/
package main

import "fmt"

func Max(a, b int)int{
	if a > b{
		return a
	}
	return b
}

func maxSubArray(nums []int)int{
	maxSum, currSum := 0, 0
	for i := 0; i < len(nums); i++ {
		currSum += nums[i]
		maxSum = Max(currSum, maxSum)
		if currSum < 0{
			currSum = 0
		}
	}
	return maxSum
}

func main(){
	nums := []int{-2,1,-3,4,-1,2,1,-5,4}
	fmt.Println(maxSubArray(nums))
	
}