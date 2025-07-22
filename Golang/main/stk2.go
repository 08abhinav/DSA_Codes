/*Implementing Stack using struct*/
package main

import "fmt"
const MAX = 5
type stack struct{
	top int
	arr [MAX]int
}

func (s *stack) push(){
	if s.top == MAX-1{
		fmt.Println("Stack overflow")
		return
	}
	var x int
	fmt.Println("Enter the value to push: ")
	fmt.Scan(&x)

	s.top++
	s.arr[s.top] = x
}

func (s *stack) pop(){
	if s.top == -1{
		fmt.Println("Stack underflow")
		return
	}
	fmt.Println("Popped element: ", s.arr[s.top])
	s.top--
}

func (s *stack) display(){
	if s.top == -1{
		fmt.Println("Stack is empty")
		return
	}
	fmt.Println("Elements in stack")
	for i:=s.top; i>=0; i--{
		fmt.Println(s.arr[i])
	}
}

func main(){
	var s stack
	s.top = -1

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