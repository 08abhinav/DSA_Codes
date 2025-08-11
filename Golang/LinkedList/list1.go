/*
Implemented Linked list in go where insert, delete and display functions are created
*/
package main

import "fmt"

type List struct{
	data int
	next *List
}

func insert(head *List) *List{
	var x int
	fmt.Println("Enter the value to insert: ")
	fmt.Scanf("%d", &x)

	ptr := &List{data: x}

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
		i = head.next
	}
}

func delete(head *List) *List{
	display(head)
	var x int
	fmt.Println("Enter the value to delete: ")
	fmt.Scanf("%d", &x)

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