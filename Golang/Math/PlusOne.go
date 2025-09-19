package main

import "fmt"

func plusOne(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i-- {
		if digits[i]+1 != 10 {
			digits[i] += 1
			return digits
		}
		digits[i] = 0
	}

	newDigits := make([]int, len(digits) + 1)
	newDigits[0] = 1
	return newDigits
}

func main() {
	digits := []int{1, 2, 3}
	fmt.Println(plusOne(digits))
}