package main

import "fmt"

func canCompleteCircle(gas, cost []int) int {
	start, totalGas, currGas := 0, 0, 0
	for i := 0; i < len(gas); i++ {
		totalGas += gas[i] - cost[i]
		currGas += gas[i] - cost[i]

		if currGas < 0 {
			currGas = 0
			start = i + 1
		}
	}
	if totalGas >= 0 {
		return start
	}
	return -1
}

func main() {
	gas := []int{1, 2, 3, 4, 5}
	cost := []int{3, 4, 5, 1, 2}
	fmt.Println(canCompleteCircle(gas, cost))
}