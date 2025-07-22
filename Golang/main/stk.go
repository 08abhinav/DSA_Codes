package main

// import "fmt"

const max = 5

// func push(arr *[max]int, top int)int{
// 	if top == max - 1{
// 		fmt.Println("Stack overflow");
// 		return top;
// 	}

// 	var x int
// 	fmt.Println("Enter the value to push: ")
// 	fmt.Scan(&x)

// 	top++
// 	arr[top] = x
// 	return top
// }

// func pop(arr *[max]int, top int)int{
// 	if top == -1{
// 		fmt.Println("Stack underflow");
// 		return top
// 	}
// 	fmt.Println("Popped element: ", arr[top])
// 	top--
// 	return top
// }

// func display(arr *[max]int, top int){
// 	if top == -1{
// 		fmt.Println("Stack is empty")
// 		return
// 	}
// 	fmt.Println("Elements in stack")
// 	for i:=top; i>=0; i--{
// 		fmt.Println(arr[i])
// 	}
// }

// func main() {
// 	var arr [max]int
// 	top := -1

// 	for {
// 		var ch int
// 		fmt.Println("1.Push\n2.Pop\n3.Display\nEnter your choice: ")
// 		fmt.Scan(&ch)
// 		switch ch{
// 		case 1: top = push(&arr, top)
// 		break;

// 		case 2: top = pop(&arr, top)
// 		break;

// 		case 3: display(&arr, top)
// 		break;

// 		default: fmt.Println("Invalid choice")
// 		return
// 		}
// 	}

// }