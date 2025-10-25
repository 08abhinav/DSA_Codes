func totalMoney(n int)int{
	w, d := n / 7, n % 7
	return (w * (49 + 7 * w) + d * (2 * w + d + 1)) / 2
}