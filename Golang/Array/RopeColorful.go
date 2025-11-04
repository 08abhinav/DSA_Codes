/*1578. Minimum Time to Make Rope Colorful
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. 
Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] 
is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful*/
package main

import "fmt"

func ropeColorful(colors string, neededTime []int) int {
	left, res := 0, 0
	for right := 1; right < len(colors); right++ {
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