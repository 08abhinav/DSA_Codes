package main

import "fmt"

func searchK(arr []int, k int) int {
	n := len(arr)
	low, high, res := 0, n-1, n
	for low <= high {
		mid := (low + high) / 2
		if arr[mid] >= k {
			res = mid
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return res
}

func main() {
	arr := []int{1, 3, 5, 7}
	k := 4
	fmt.Println(searchK(arr, k))
}