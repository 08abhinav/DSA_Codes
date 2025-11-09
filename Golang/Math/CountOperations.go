package main

import "fmt"

func countOps(num1, num2 int) int {
	res := 0
	for num1 > 0 && num2 > 0 {
		res += num1 / num2
		num1 %= num2
		num1, num2 = num2, num1
	}
	return res
}

func main() {
	num1, num2 := 2, 3
	fmt.Println(countOps(num1, num2))
}