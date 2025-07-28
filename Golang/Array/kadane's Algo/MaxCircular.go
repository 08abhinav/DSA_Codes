package main

func max(a, b int)int{
	if a > b{
		return a
	}
	return b
}

func min(a, b int)int{
	if a < b{
		return a
	}
	return b
}

func maxCircular(arr[]int)int{
	totalSum, minSum, currMin, currMax := 0, 0, 0, 0
	maxSum := arr[0]

	for i := 0; i < len(arr) ; i++{
		currMax = max(currMax + arr[i], arr[i])
		maxSum = max(maxSum, currMax)

		currMin = min(currMin + arr[i], arr[i])
		minSum = min(currMin, minSum)

		totalSum += arr[i]
	}

	sum := maxSum
	circularSum := totalSum - minSum

	if minSum == totalSum{
		return sum
	}

	return max(sum, circularSum)
}