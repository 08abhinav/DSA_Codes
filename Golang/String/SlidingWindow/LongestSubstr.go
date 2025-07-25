/*Given a string s, find the length of the longest substring without duplicate characters*/
package main

import "fmt"

func LengthOfLongestSubString(s string) int {
	charSet := make(map[byte]bool)
	left, maxLen := 0, 0

	for right := 0; right < len(s); right++ {
		for charSet[s[right]] {
			delete(charSet, s[left])
			left++
		}

		charSet[s[right]] = true
		if right-left+1 > maxLen {
			maxLen = right - left + 1
		}
	}
	return maxLen
}

func main() {
	s := "abcabcbb"
	fmt.Println(LengthOfLongestSubString(s));
}