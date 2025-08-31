package main

import "fmt"




func findOccur(arr []int, x int) []int {
	first := firstOccur(arr, x)
	last := lastOccur(arr, x)

	res := make([]int, 2)
	res[0] = first
	res[1] = last
	return res
}

