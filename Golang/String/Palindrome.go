/*To check whether a given string is palindrome or not*/
package main

import "fmt"

func isPalindromic(s string) bool {
	left, right := 0, len(s)-1
	for left <= right {
		if s[left] != s[right] {
			return false
		}
		left += 1
		right -= 1
	}
	return true
}

func main() {
	s := "abcba"
	fmt.Println(isPalindromic(s));
}