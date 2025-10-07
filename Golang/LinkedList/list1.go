/*
Implemented Linked list in go where insert, delete and display functions are created
*/
package main

import (
	"fmt"
)

type List struct{
	data int
	next *List
}

func insert(head *List) *List{
	var x int
	fmt.Println("Enter the value to insert: ")
	fmt.Scan(&x)

	ptr := &List{
		data: x,
		next: nil,
	}

	if head == nil{
		return ptr
	}

	temp := head

	for temp.next != nil{
		temp = temp.next
	}
	temp.next = ptr;
	return head;
}

func display(head *List){
	if head == nil{
		fmt.Println("List is empty")
		return
	}
	i := head
	fmt.Println("Values in list")
	for i != nil{
		fmt.Println(i.data)
		i = i.next
	}
}

func delete(head *List) *List{
	display(head)
	var x int
	fmt.Println("Enter the value to delete: ")
	fmt.Scan(&x)

	if head.data == x{
		return head.next
	}

	temp := head
	for temp.next != nil{
		if temp.next.data == x{
			temp.next = temp.next.next
			break;
		}
		temp = temp.next
	}
	fmt.Println("After deletion")
	display(head)
	return head
}

func reverse(head *List) *List{
	if head == nil{
		return head
	}

	curr := head
	var prev *List = nil

	for curr != nil{
		temp := curr.next
		curr.next = prev
		prev = curr
		curr = temp
	}
	return prev
}

func main(){
	var Head *List
	var ch int
	for {
		fmt.Println("\n1.Insert\n2.Delete\n3.Display\n4.Reverse\n5.Exit")
		fmt.Scan(&ch)

		switch ch {
		case 1:
			Head = insert(Head)
		case 2:
			Head = delete(Head)
		case 3:
			display(Head)
		case 4:
			Head = reverse(Head)
			display(Head)
		case 5:
			return
		default:
			fmt.Println("Invalid choice")
		}
	}
}