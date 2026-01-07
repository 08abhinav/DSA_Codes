/*
2591. Distribute Money to Maximum Children
You are given an integer money denoting the amount of money (in dollars) that you have and another integer children 
denoting the number of children that you must distribute the money to.
You have to distribute the money according to the following rules:

All money must be distributed.
Everyone must receive at least 1 dollar.
Nobody receives 4 dollars.
Return the maximum number of children who may receive exactly 8 dollars if you distribute the money according to the 
aforementioned rules. If there is no way to distribute the money, return -1.
*/
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