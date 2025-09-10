func minHeapify(arr []int, i, n int){
	left := 2 * i + 1
	right := 2 * i + 2
	small := i

	if left < n && arr[left] < arr[small]{
		small = left
	}

	if right < n && arr[right] < arr[small]{
		small = right
	}

	if small != i{
		int temp = arr[i]
		arr[i] = arr[small]
		arr[small] = temp
		minHeapify(arr, small, n)
	}
}

func convertToMinHeap(arr []int, n int){
	for i := (n - 2) / 2; i >= 0; i--{
		minHeapify(arr, i, n)
	}
}