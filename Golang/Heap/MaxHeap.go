package main

import "fmt"

func maxHeapify(arr []int, i, n int) {
	left := 2*i + 1
	right := 2*i + 2
	large := i

	if left < n && arr[left] > arr[large] {
		large = left
	}

	if right < n && arr[right] > arr[large] {
		large = right
	}

	if large != i {
		temp := arr[i]
		arr[i] = arr[large]
		arr[large] = temp
		maxHeapify(arr, large, n)
	}
}

func convertToMaxHeap(arr []int, n int) {
	for i := (n - 2) / 2; i >= 0; i-- {
		maxHeapify(arr, i, n)
	}
}

func main() {
	arr := []int{3, 1, 6, 5, 2, 4}
	n := len(arr)
	convertToMaxHeap(arr, n)
	fmt.Println(arr)
}
