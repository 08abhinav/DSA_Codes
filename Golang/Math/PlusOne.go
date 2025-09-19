/*66. Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain 
any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/
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