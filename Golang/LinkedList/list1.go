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