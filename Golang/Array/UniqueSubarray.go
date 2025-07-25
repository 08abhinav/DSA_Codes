package main
import "sort"

func maxSum(arr []int)int{
	sort.Ints(arr)
	prev := arr[len(arr) - 1]
	sum := prev

	for i := len(arr) - 2; i >= 0; i--{
		n := arr[i]
		if n < 0{
			return sum
		}else if n != prev{
			sum += n
		}
		prev = n
	}
	return sum;
}