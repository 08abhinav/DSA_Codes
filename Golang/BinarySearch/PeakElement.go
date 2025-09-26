package main
import "fmt"

func peakEle(nums []int)int{
	left, right := 0, len(nums) - 1
	for left < right{
		mid := left + (right - left) / 2;
		if nums[mid] > nums[mid + 1]{
			right = mid
		}else{
			left = mid
		}
	}
	return left
}

func main(){
	nums := []int{6, 5, 4, 3, 2, 3, 4}
	fmt.Println(peakEle(nums))
}