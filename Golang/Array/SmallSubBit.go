package main

func smallestSubarray(nums []int)[]int{
	n := len(nums)
	res := make([]int, n)

	for i := 0; i < n; i++{
		res[i] = 1
		for j := i - 1; j >= 0; j--{
			if (nums[j] | nums[i]) == nums[j]{
				break;
			}
			nums[j] |= nums[i]
			res[j] = i - j + 1
		}
	}
	return res
}