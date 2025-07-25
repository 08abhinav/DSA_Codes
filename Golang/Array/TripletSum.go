package main

import (
	"sort"
	"fmt"
)

func hasTriplet(arr []int, target int) bool {
	n := len(arr)
	sort.Ints(arr)

	for i:=0; i<n-2; i++{
		l, r := i + 1, n - 1
		res := target - arr[i]

		for l < r{
			sum := arr[l] + arr[r]

			if sum == res{
				return true
			}
			if sum > res{
				r--
			}else{
				l++
			}
		}
	}
	return false
}

func main(){
	arr := []int{1, 4, 45, 6, 10, 8}
	fmt.Println(hasTriplet(arr, 13))
}
