package main

import "fmt"

func numSub(s string) int {
	var total, count, mod int64 = 0, 0, 1000000007

	for i := 0; i < len(s); i++ {
		if s[i] == '1' {
			count += 1
		} else {
			count = 0
		}
		total = (total + count) % mod
	}
	return int(total)
}

func main() {
	s := "0110111"
	fmt.Print(numSub(s))
}