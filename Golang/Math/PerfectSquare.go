/*
367. Valid Perfect Square
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.*/
package main

import "fmt"

func isPerfectSquare(n int) bool{
	start := 1
	end := n
	for start <= end{
		mid := (start + end) / 2
		if int64(mid) * int64(mid) == int64(n){
			return true;
		}else if int64(mid) * int64(mid) > int64(n){
			end = mid - 1
		}else{
			start = mid + 1
		}
	}
	return false;
}

func main(){
	n := 16
	fmt.Println(isPerfectSquare(n))
}