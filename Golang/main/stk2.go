/*Implementing Stack using struct*/
package main

import "fmt"
const MAX = 5
type stack struct{
	top int
	arr [MAX]int
}



func main(){
	var s stack
	s.top = 1

	for{
		var ch int
		fmt.Println("1.Push\n2.Pop\n3.Display\nEnter the choice: ")
		fmt.Scan(&ch)

		switch ch{
		case 1: s.push()
		break;

		case 2: s.pop()
		break;

		case 3: s.display()
		break;

		default: fmt.Println("Invalid choice")
		return
		}
	}
}