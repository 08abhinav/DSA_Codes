package main

import "fmt"


func firstOccur(arr []int, x int) int {
	low, high, res := 0, len(arr)-1, -1
	for low <= high {
		mid := (low + high) / 2

		if arr[mid] == x {
			res = mid
			high = mid - 1
		} else if arr[mid] > x {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return res
}

func lastOccur(arr []int, x int) int {
	low, high, res := 0, len(arr)-1, -1
	for low <= high {
		mid := (low + high) / 2

		if arr[mid] == x {
			res = mid
			low = mid + 1
		} else if arr[mid] < x {
			low = mid + 1
		} else {
			high = mid - 1
		}
	}
	return res
}

func findOccur(arr []int, x int) []int {
	first := firstOccur(arr, x)
	last := lastOccur(arr, x)

	res := make([]int, 2)
	res[0] = first
	res[1] = last
	return res
}

func main() {
	arr := []int{1, 3, 5, 5, 5, 5, 7, 123}
	x := 5
	fmt.Println(findOccur(arr, x))
}
