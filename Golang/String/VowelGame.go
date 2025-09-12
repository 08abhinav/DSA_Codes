package main

import "fmt"

func doesAliceWins(s string) bool {
	for i := 0; i < len(s); i++ {
		if s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' {
			return true
		}
	}
	return false
}

func main() {
	s := "leetcoder"
	fmt.Println(doesAliceWins(s))
}