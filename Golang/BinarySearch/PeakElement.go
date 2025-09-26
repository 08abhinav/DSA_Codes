/*162. Find Peak Element
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always 
considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.*/
package main
import "fmt"

func peakEle(nums []int)int{
	left, right := 0, len(nums) - 1
	for left < right{
		mid := left + (right - left) / 2;
		if nums[mid] > nums[mid + 1]{
			right = mid
		}else{
			left = mid
		}
	}
	return left
}

func main(){
	nums := []int{6, 5, 4, 3, 2, 3, 4}
	fmt.Println(peakEle(nums))
}