package main

import "fmt"

func ropeColorful(colors string, neededTime []int) int {
	left, res := 0, 0
	for right := 0; right < len(colors); right++ {
		if colors[left] == colors[right] {
			if neededTime[left] < neededTime[right] {
				res += neededTime[left]
				left = right
			} else {
				res += neededTime[right]
			}
		} else {
			left = right
		}
	}
	return res
}

func main() {
	colors := "aabaa"
	neededTime := []int{1, 2, 3, 4, 1}
	fmt.Println(ropeColorful(colors, neededTime))
}