package main

import (
	"net/http"
	"github.com/gin-gonic/gin"
	// "errors"
)

type book struct {
	ID     string `json:"id"`
	Title  string `json:"title"`
	Author string `json:"author"`
	Price  int    `json:"price"`
}
var books = []book{
	{ID: "1", Title: "Book1", Author: "xyz", Price: 200},
	{ID: "2", Title: "Book2", Author: "abc", Price: 850},
	{ID: "3", Title: "Book3", Author: "def", Price: 6500},
	{ID: "4", Title: "Book4", Author: "ghi", Price: 500},
	{ID: "5", Title: "Book5", Author: "jkl", Price: 1200},
}

// func homePage(c *gin.Context){
// 	c.IndentedJSON(http.StatusOK, "Welcome user")
// }

func getBooks(c *gin.Context){
	c.IndentedJSON(http.StatusOK, books)
}

func postBook(c *gin.Context){
	var newBook book

	if err:= c.BindJSON(&newBook); err != nil{
		return
	}

	books = append(books, newBook)
	c.IndentedJSON(http.StatusCreated, newBook)
}
// func main(){
// 	router := gin.Default()
// 	router.GET("/", homePage)
// 	router.GET("/books", getBooks)
// 	router.POST("/addBook", postBook)
// 	router.Run("localhost:8000")
// }