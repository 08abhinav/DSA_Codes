package main

import "fmt"


func mergeSort(arr []int, low, high int) {
	if low < high {
		mid := (low + high) / 2
		mergeSort(arr, low, mid)
		mergeSort(arr, mid+1, high)
		merge(arr, low, mid, high)
	}
}

func merge(arr []int, low, mid, high int) {
	temp := make([]int, high-low+1)
	i, j, k := low, mid+1, 0

	for i <= mid && j <= high {
		if arr[i] < arr[j] {
			temp[k] = arr[i]
			i++
		} else {
			temp[k] = arr[j]
			j++
		}
		k++
	}

	for i <= mid {
		temp[k] = arr[i]
		i++
		k++
	}
	for j <= high {
		temp[k] = arr[j]
		j++
		k++
	}

	for idx, val := range temp {
		arr[low+idx] = val
	}
}

func main() {
	arr := []int{5, 2, 9, 1, 6}
	mergeSort(arr, 0, len(arr)-1)
	fmt.Println("Sorted:", arr)
}
