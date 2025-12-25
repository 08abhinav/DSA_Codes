/*
3074. Apple Redistribution into Boxes
You are given an array apple of size n and an array capacity of size m.

There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, 
and the ith box has a capacity of capacity[i] apples.
Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.
Note that, apples from the same pack can be distributed into different boxes.
*/
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