/*11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the 
ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.*/
package main

import "fmt"

func maxArea(height []int) int {
	l, res, r := 0, 0, len(height) - 1

	for l < r {
		area := min(height[l], height[r]) * (r - l)
		res = max(area, res)

		if height[l] > height[r] {
			r -= 1
		} else {
			l += 1
		}
	}
	return res
}

func min(a, b int) int {
	if a < b {
		return a
	} else {
		return b
	}
}

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func main() {
	height := []int{1, 8, 6, 3, 5, 4, 8, 3, 7}
	fmt.Println(maxArea(height))
}