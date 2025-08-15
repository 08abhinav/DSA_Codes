package main

import "fmt"

func bubbleSort(arr []int) {
	for i := 0; i < len(arr)-1; i++ {
		for j := i + 1; j < len(arr); j++ {
			if arr[j] < arr[i] {
				arr[j], arr[i] = arr[i], arr[j]
			}
		}
	}

	fmt.Println("After sorting the array")
	for _, val := range arr{
		fmt.Println(val)
	}
}

func main() {
	arr := []int{10, 9, 8, 7, 6}
	bubbleSort(arr)
}