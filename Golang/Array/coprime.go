package main

// import "fmt"

func gcd(a, b int)int{
	if b == 0{
		return a
	}else{
		return gcd(b, a % b)
	}
}

func countCoprime(nums []int)int{
	n := len(nums)
	var count int
	for i:=0; i<n-1; i++{
		for j:=i+1; j<n; j++{
			if gcd(nums[i], nums[j]) == 1{
				count++
			}
		}
	}
	return count
}

// func main(){
// 	nums := [...]int{1, 2, 3}
// 	fmt.Println(countCoprime(nums[:]))
// }