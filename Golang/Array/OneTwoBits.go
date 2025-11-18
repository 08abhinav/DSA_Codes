func isOneBitCharacter(bits []int)bool{
	n, i := len(bits), 0
	for i < n - 1{
		i += bits[i] + 1
	}
	return i == n - 1
}