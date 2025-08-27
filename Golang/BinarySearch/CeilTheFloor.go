package main

import (
	"fmt"
	"sort"
)
func getFloor(arr []int, k int)int{
	low, high, res := 0, len(arr) - 1, -1
	for low <= high{
		mid := (low + high) / 2
		if arr[mid] <= k{
			res = arr[mid]
			low = mid + 1
		}else{
			high = mid - 1
		}
	}
	return res
}

func getCeil(arr []int, k int)int{
	low, high, res := 0, len(arr) - 1, -1
	for low <= high{
		mid := (low + high) / 2
		if(arr[mid] >= k){
			res = arr[mid]
			high = mid - 1
		}else{
			low = mid + 1
		}
	}
	return res
}

func ceilFloor(arr []int, k int) []int{
	sort.Ints(arr)
	f := getFloor(arr, k)
	c := getCeil(arr, k)

	return []int{f, c}
}

func main(){
	arr := []int{5, 6, 8, 9, 6, 5, 5, 6}
	k := 7
	fmt.Println(ceilFloor(arr, k))
}