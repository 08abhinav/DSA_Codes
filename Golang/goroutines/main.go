package main

import (
	"fmt"
	"time"
)

//channel
ch := make(chan int)

go func(){
	ch <- 69
}

val := <- ch
fmt.Println(val)

//Goroutine
func greet(){
	fmt.Println("Warm greetings from greet function")
}

func main(){
	greet();
	time.Sleep(time.Second)
	fmt.Println("Hi from main function")
}