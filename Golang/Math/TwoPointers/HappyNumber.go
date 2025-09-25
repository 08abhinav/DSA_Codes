/*202. Happy Number
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/
package twopointers

import "fmt"

func isHappyNumber(n int) bool {
	slow, fast := n, n
	for {
		slow = square(slow)
		fast = square(square(fast))

		if slow == fast {
			break
		}
	}
	return slow == 1
}

func square(n int) int {
	ans := 0
	for n > 0 {
		rem := n % 10
		ans += rem * rem
		n /= 10
	}
	return n
}

func main() {
	n := 19
	fmt.Println(isHappyNumber(n))
}