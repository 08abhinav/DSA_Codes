package main

import "fmt"

type shape interface{
	area() float32
}

type rect struct{
	length int
	width int
}

func (r rect) area() int{
	return r.length * r.width
}

func main(){
	var r rect
	r.length = 10
	r.width = 20
	fmt.Println(r.area())
}