/*
3477. Fruits Into Baskets II
given two arrays of integers, fruits and baskets, each of length n, 
where fruits[i] represents the quantity of the ith type of fruit, and 
baskets[j] represents the capacity of the jth basket.

From left to right, place the fruits according to these rules:

Each fruit type must be placed in the leftmost available basket with a capacity 
greater than or equal to the quantity of that fruit type.
Each basket can hold only one type of fruit.
If a fruit type cannot be placed in any basket, it remains unplaced.
Return the number of fruit types that remain unplaced after all possible allocations are made.*/
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

func main() {
	fruits := []int{4, 2, 5}
	baskets := []int{3, 5, 4}
	fmt.Println(numOfUnplacedFruits(fruits, baskets))
}