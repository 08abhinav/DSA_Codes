/*
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x 
is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x 
is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.*/
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