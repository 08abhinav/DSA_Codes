func brokenCalcu(startValue, target int)int{
	res := 0
	for target > startValue{
		if target % 2 == 0{
			target /= 2
		}else{
			target += 1
		}
		res += 1
	}
	return res + (startValue - target)
}