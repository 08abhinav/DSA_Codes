package main

import "fmt"

func coundOdd(low, high int)int{
	return (high + 1) / 2 - low / 2
}

main(){
	low, high := 3, 7
	fmt.Println(coundOdd(low, high))
}