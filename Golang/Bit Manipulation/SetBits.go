/*3370. Smallest Number With All Set Bits
You are given a positive number n.

Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits*/
package main

import "fmt"

// Approach 1
// func smallNum(n int)int{
// 	for i := 0; i <= n; i++{
// 		z := 1 << i
// 		if z > n{
// 			return z - 1
// 		}
// 	}
// 	return 0
// }

// Approach 2
func smallNum(n int)int{
	for (n & (n + 1)) != 0{
		n |= n + 1
	}
	return n
}

func main(){
	n := 5
	fmt.Println(smallNum(n))
}