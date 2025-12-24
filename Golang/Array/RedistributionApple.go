package main
import ( "fmt"
"sort"

)

func minBoxes(apple, capacity []int)int{
	sort.Ints(capacity)
	sum := 0
	for _, i := range apple{
		sum += i
	}

	res, cap := 0, 0
	for i := len(capacity) - 1; i >= 0; i--{
		cap = capacity[i]
		if cap >= sum{
			res = len(capacity) - i
			break;
		}
	}
	return res
}

func main(){
	apple := []int{5, 5, 5}
	capacity := []int{2, 4, 2, 7}
	fmt.Println(minBoxes(apple, capacity))
}