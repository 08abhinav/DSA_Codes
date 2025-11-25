func minMoves(nums []int)int{
	if(len(nums) == 0){
		return 0
	}

	min, res := nums[0], 0
	for _, i := range nums{
		if i < min{
			min = i
		}
	}

	for _, j := range nums{
		res += j - min
	}
	return res
}