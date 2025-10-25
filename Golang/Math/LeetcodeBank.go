/*1716. Calculate Money in Leetcode Bank
Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 
more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.

Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.*/
package main

import "fmt"

func totalMoney(n int) int {
	w, d := n/7, n%7
	return (w*(49+7*w) + d*(2*w+d+1)) / 2
}

func main() {
	n := 4
	fmt.Println(totalMoney(n))
}