package main

import "fmt"

func gcdOfStrings(str1, str2 string) string {
	if str1+str2 != str2+str1 {
		return ""
	}
	g := gcd(len(str1), len(str2))
	return str1[:g]
}

func gcd(a, b int) int {
	if b == 0 {
		return a
	}
	return gcd(b, a%b)
}

func main() {
	str1 := "ABABAB"
	str2 := "AB"
	fmt.Println(gcdOfStrings(str1, str2))
}