package main

// Approach 1
func smallNum(n int)int{
	for i := 0; i <= n; i++{
		z := 1 << i
		if z > n{
			return z - 1
		}
	}
	return 0
}

