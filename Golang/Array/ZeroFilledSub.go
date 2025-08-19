package main

func zeroFilledSub(nums []int)int64{
	var count, ans int64
	count, ans = 0, 0
	for _, val := range nums{
		if val == 0{
			count++
			ans += count
		}else{
			count = 0
		}
	}
	return  ans
}