func maximizeHappiness(happiness []int, k int)int64{
	sort.Ints(happiness)
	n := happiness.length - 1
	var res int64

	for i := 0; i < k; i++{
		if happiness[n - i] - i > 0{
			res += int64 (happiness[n - i] - i)
		}else{
			break
		}
	}
	return res
}