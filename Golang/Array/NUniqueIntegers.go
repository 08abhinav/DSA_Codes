/*1304. Find N Unique Integers Sum up to Zero
Given an integer n, return any array containing n unique integers such that they add up to 0.*/
package main

import "fmt"

func sumZeros(n int) []int {
	k := 1
	res := make([]int, n)

	for i := 0; i < n/2; i++ {
		res[i] = k
		res[n-1-i] = -k
		k += 1
	}
	return res
}

func main() {
	n := 5
	fmt.Println(sumZeros(n))
}