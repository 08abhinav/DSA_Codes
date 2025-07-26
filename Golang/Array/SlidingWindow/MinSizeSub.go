package slidingwindow

func minSubarray(nums[]int, target int)int{
	left, sum := 0, 0
	minLen := len(nums) + 1

	for right := 0; right<len(nums); right++{
		sum += nums[right]

		for sum >= target{
			if right - left + 1 < minLen {
				minLen = right - left + 1
            }			
			sum -= nums[left]
			left++
		}
	}
	if minLen == len(nums) + 1{
		return 0
	}
	return minLen
}
