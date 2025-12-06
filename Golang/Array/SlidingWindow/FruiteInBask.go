package main

import "fmt"

func totalFruit(fruits []int) int {
	n := len(fruits)
	if n == 0 {
		return 0
	}
	count := make(map[int]int)
	left, maxLen := 0, 0

	for right := 0; right < n; right++ {
		count[fruits[right]]++

		for len(count) > 2 {
			leftFruit := fruits[left]
			count[fruits[left]]--
			if count[leftFruit] == 0 {
				delete(count, leftFruit)
			}
			left++
		}

		windowSize := right - left + 1
		if maxLen < windowSize {
			maxLen = windowSize
		}
	}
	return maxLen
}

// func main() {
// 	fruits := []int{1, 2, 1, 2, 3, 2, 2}
// 	fmt.Println(totalFruit(fruits))
// }