// package main

// import (
// 	"net/http"
// 	"github.com/gin-gonic/gin"
// )

// type student struct{
// 	Id		string `json: "id"`
// 	Name 	string `json: "name"`
// 	RollNO  int    `json: "rollno`
// }

// var stud = []student{
// 	{Id: "101", Name: "John", RollNO: 555},
// 	{Id: "102", Name: "Javed", RollNO: 556},
// 	{Id: "103", Name: "Jai", RollNO: 557},
// }

// func homePage(c *gin.Context){
// 	c.IndentedJSON(http.StatusOK, "Welcome user")
// }

// func getStud(c *gin.Context){
// 	c.IndentedJSON(http.StatusOK, stud)
// }

// func postStud(c *gin.Context){
// 	var newEntry student

// 	if err := c.BindJSON(&newEntry); err != nil{
// 		return
// 	}

// 	stud = append(stud, newEntry)
// 	c.IndentedJSON(http.StatusCreated, newEntry)
// }

// func getStudById(c *gin.Context){
// 	id := c.Param("Id")

// 	for _, a := range stud{
// 		if a.Id == id{
// 			c.IndentedJSON(http.StatusOK, a)
// 			return
// 		}
// 	}
// 	c.IndentedJSON(http.StatusNotFound, gin.H{"message": "student not found"})
// }

// func main(){
// 	router := gin.Default()
// 	router.GET("/", homePage);
// 	router.GET("/allStud", getStud);
// 	router.GET("/stud/:id", getStudById)
// 	router.POST("/addStud", postStud);
// 	router.Run("localhost:6969")
// }