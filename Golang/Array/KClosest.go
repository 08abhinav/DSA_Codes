func findClosestEle(arr []int, k, x int)int{
	l, r := 0, len(arr) - 1

	for r - l + 1 > k{
		if abs(arr[l] - k) > abs(arr[r] - k){
			l += 1
		}else{
			r -= 1
		}
	}
	return arr[l : r+1]
}

func abs(a int)int{
	if a < 0{
		return -a
	}
	return a
}

func main(){
	arr := []int{1, 2, 3, 4, 5}
	k, x := 4, 3
	fmt.Println(findClosestEle(arr, k, x))
}