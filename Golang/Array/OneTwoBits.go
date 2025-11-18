package main

import "fmt"

func isOneBitCharacter(bits []int) bool {
	n, i := len(bits), 0
	for i < n-1 {
		i += bits[i] + 1
	}
	return i == n-1
}

func main() {
	bits := []int{1, 1, 1, 0}
	fmt.Println(isOneBitCharacter(bits))
}