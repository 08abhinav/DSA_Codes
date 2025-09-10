func convertToMinHeap(arr []int, n int){
	for i := (n - 2) / 2; i >= 0; i--{
		minHeapify(arr, i, n)
	}
}