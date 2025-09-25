package twopointers

func isHappyNumber(n int) bool {
	slow, fast := n, n
	for{
		slow = square(slow)
		fast = square(square(fast))

		if slow == fast{
			break;
		}
	}
	return slow == 1
}