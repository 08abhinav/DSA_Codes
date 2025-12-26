package main
import ("sort"
"fmt")

func maximizeHappiness(happiness []int, k int)int64{
	sort.Ints(happiness)
	n := len(happiness) - 1
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

func main(){
	happiness, k := []int{2, 4, 5, 3}, 2
	fmt.Println(maximizeHappiness(happiness, k))
}