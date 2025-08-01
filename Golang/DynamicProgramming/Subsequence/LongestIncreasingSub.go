package main

func Max(a, b int)int{
	if a > b{
		return a
	}
	return b
}

func lengthOfLIS(nums []int)int{
	n := len(nums)
	if n == 0 {
		return 0
	}
	dp := make([]int, n)
	for i := 0; i < n; i++{
		dp[i] = 1;
	}

	maxLen := 1
	for i := 1; i < n; i++{
		for j := 0; j < i; j++{
			if nums[i] > nums[j]{
				dp[i] = Max(dp[j] + 1, dp[i])
			}
		}
		maxLen = Max(dp[i], maxLen)
	}
	return maxLen
}