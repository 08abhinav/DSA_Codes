package main

import "fmt"

func min(a, b int) int {
	if a > b {
		return b
	}
	return a
}

func distMoney(money, children int) int {
	money -= children

	if money/7 == children && money%7 == 0 {
		return children
	}

	if money/7 == children-1 && money%7 == 3 {
		return children - 2
	}

	return min(children-1, money/7)
}

func main() {
	fmt.Println(distMoney(20, 3))
}