func(n int)[]int{
	k := 1
	res := make([] int, n)

	for i := 0; i < n / 2; i++{
		res[i] = k
		res[n - 1 - i] = -k
		k += 1
	}
	return res
}