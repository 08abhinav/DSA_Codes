/*1925. Count Square Sum Triples
A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.

Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.*/
package main
import (
	"fmt"
	"math")
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