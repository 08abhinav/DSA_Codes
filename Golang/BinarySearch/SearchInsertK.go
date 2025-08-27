package main
func searchK(arr []int, k int)int{
	n := len(arr)
	low, high, res := 0, n - 1, n
	for low <= high{
		mid := (low + high) / 2
		if(arr[mid] >= k){
			res = mid
			high = mid - 1
		}else{
			low = mid + 1
		}
	}
	return res
}