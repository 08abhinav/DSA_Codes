package main
import (
	"sort"
	"fmt"
)

func maxSum(arr []int)int{
	sort.Ints(arr)
	prev := arr[len(arr) - 1]
	sum := prev

	for i := len(arr) - 2; i >= 0; i--{
		n := arr[i]
		if n < 0{
			return sum
		}else if n != prev{
			sum += n
		}
		prev = n
	}
	return sum;
}

func main(){
	arr := []int{1, 2, 3, 4, 5}
	fmt.Println(maxSum(arr))
}