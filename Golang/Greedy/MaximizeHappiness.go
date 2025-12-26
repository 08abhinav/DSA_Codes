/*3075. Maximize Happiness of Selected Children
You are given an array happiness of length n, and a positive integer k.

There are n children standing in a queue, where the ith child has happiness value happiness[i]. 
You want to select k children from these n children in k turns.

In each turn, when you select a child, the happiness value of all the children that have not been 
selected till now decreases by 1. Note that the happiness value cannot become negative and gets 
decremented only if it is positive.

Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.*/
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