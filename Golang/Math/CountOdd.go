/*1523. Count Odd Numbers in an Interval Range
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).*/
package main

import "fmt"

func coundOdd(low, high int)int{
	return (high + 1) / 2 - low / 2
}

main(){
	low, high := 3, 7
	fmt.Println(coundOdd(low, high))
}