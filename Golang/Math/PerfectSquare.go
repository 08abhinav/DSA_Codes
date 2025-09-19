package main
import "fmt"

func isPerfectSquare(n int) bool{
	start := 1
	end := n
	for start <= end{
		mid := (start + end) / 2
		if int64(mid) * int64(mid) == int64(n){
			return true;
		}else if int64(mid) * int64(mid) > int64(n){
			end = mid - 1
		}else{
			start = mid + 1
		}
	}
	return false;
}

func main(){
	n := 16
	fmt.Println(isPerfectSquare(n))
}