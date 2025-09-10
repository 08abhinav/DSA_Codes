package main

func convertToMaxHeap(arr []int, n int){
	for i := (n - 2) / 2; i >= 0; i--{
		maxHeapify(arr, i, n)
	}
}
