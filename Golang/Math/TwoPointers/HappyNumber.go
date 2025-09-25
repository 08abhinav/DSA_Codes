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