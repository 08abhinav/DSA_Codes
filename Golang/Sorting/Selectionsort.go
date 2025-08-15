package main

import "fmt"

func selectionSort(arr []int) {
	for i := 0; i < len(arr); i++ {
		midIdx := i
		for j := i + 1; j < len(arr); j++ {
			if arr[midIdx] > arr[j] {
				midIdx = j
			}
		}
		if midIdx != i {
			temp := arr[midIdx]
			arr[midIdx] = arr[i]
			arr[i] = temp
		}
	}
}

func main() {
	arr := []int{5, 4, 3, 2, 1}
	selectionSort(arr)
	fmt.Println("After sorting", arr)
}