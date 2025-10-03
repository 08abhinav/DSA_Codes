package main

import "fmt"

func maxWaterBottles(numBottles, numExchange int) int {
	empty := numBottles
	for empty >= numExchange {
		empty -= numExchange
		numBottles += 1
		numExchange += 1
		empty += 1
	}
	return numBottles
}

func main() {
	numBottles, numExchange := 13, 6
	fmt.Println(maxWaterBottles(numBottles, numExchange))
}