package main

import "fmt"

func numOfUnplacedFruits(fruits []int, baskets []int) int {
	c := 0
	for i := 0; i < len(fruits); i++ {
		for j := 0; j < len(baskets); j++ {
			if fruits[i] <= baskets[j] {
				c++
				baskets[j] = 0
				break
			}
		}
	}
	return len(fruits) - c
}

