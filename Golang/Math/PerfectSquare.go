func isPerfectSquare(n int)boolean{
	start := 1
	end := n
	while(start <= end){
		mid := (start + end) / 2
		if int64(mid) * int64(mid) == num{
			return true;
		}else if int64(mid) * int64(mid) > num{
			end = mid - 1
		}else{
			start = mid + 1
		}
	}
	return false;
}