/*You are given an integer array nums.

You are allowed to delete any number of elements from nums without making it empty. 
After performing the deletions, select a subarray of nums such that:

All elements in the subarray are unique.
The sum of the elements in the subarray is maximized.
Return the maximum sum of such a subarray.*/
// package main
// import (
// 	"sort"
// 	"fmt"
// )

// func maxSum(arr []int)int{
// 	sort.Ints(arr)
// 	prev := arr[len(arr) - 1]
// 	sum := prev

// 	for i := len(arr) - 2; i >= 0; i--{
// 		n := arr[i]
// 		if n < 0{
// 			return sum
// 		}else if n != prev{
// 			sum += n
// 		}
// 		prev = n
// 	}
// 	return sum;
// }

// func main(){
// 	arr := []int{1, 2, 3, 4, 5}
// 	fmt.Println(maxSum(arr))
// }