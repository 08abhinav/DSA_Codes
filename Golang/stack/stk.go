package stack

import "fmt"

const max = 5

func main() {
	var arr [max]int
	top := -1

	for {
		var ch int
		fmt.Println("1.Push\n2.Pop\n3.Display\nEnter your choice: ")
		fmt.Scan(&ch)
		switch ch{
		case 1: push(arr, top)
		break;

		case 2: pop(arr, top)
		break;

		case 3: display(arr, top)
		break;

		default: fmt.Println("Invalid choice")
		return
		}
	}

}