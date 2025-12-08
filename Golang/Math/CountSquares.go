func countSquare(n int) int{
	count := 0
	for i:= 1; i <= n; i++{
		for j := 1; j <=n; j++{
			k := i*i + j*j
			sq := int(math.Sqrt(float64(k)))

			if sq <= n && sq * sq == k{
				count += 1
			}
		}
	}
	return count
}

func main(){
	n := 5
	fmt.Println(countSquare(n))
}