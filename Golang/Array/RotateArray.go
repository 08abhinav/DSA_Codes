func rotate(nums []int, k int){
	n := len(nums)
	temp := make([]int, n)
	for i := 0; i < n; i++{
		temp[(i + k) % n] = nums[i]
	}

	for i := 0; i < n; i++{
		nums[i] = temp[i]
	}
}