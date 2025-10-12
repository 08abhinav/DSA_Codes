/*LeetCode 171 — Excel Sheet Column Number*/
package main

import "fmt"

func excelSheetNum(s string) int {
	res := 0
	for i := 0; i < len(s); i++ {
		res = res*26 + (int)(s[i]-'A'+1)
	}
	return res
}

func main() {
	s := "AB"
	fmt.Println(excelSheetNum(s))
}