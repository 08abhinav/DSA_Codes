package main

import (
	"os"
	"log"
	"net/http"
	"gorm.io/gorm"
	"go-post-auth/models"
	"go-post-auth/storage"
	"github.com/joho/godotenv"
	"github.com/gofiber/fiber/v2"

)

type Book struct{
	Author	string `json:"author"`
	Title	string	`json:"title"`	
	Publisher string `json:"publisher"`
}


type Repos struct{
	DB *gorm.DB
}  

func(r *Repos) HomePage(ctx *fiber.Ctx) error{
	return ctx.Status(http.StatusOK).JSON(&fiber.Map{
		"msg": "Welcome user",
	})
}

func(r *Repos) CreateBook(ctx *fiber.Ctx) error{
	book := models.Books{}
	err := ctx.BodyParser(&book)

	if err != nil{
		ctx.Status(http.StatusUnprocessableEntity).JSON(
			&fiber.Map{"message": "request faidl"})
			return err
	}

	err = r.DB.Create(&book).Error
	if err != nil{
		ctx.Status(http.StatusBadRequest).JSON(
			&fiber.Map{"msg": "could not create book"})
			return err
	}

	ctx.Status(http.StatusOK).JSON(&fiber.Map{"msg": "book created"})
	return nil
}

func(r *Repos) GetBooks(ctx *fiber.Ctx)error{
	bookModels := &[]models.Books{}

	err := r.DB.Find(bookModels).Error
	if err != nil{
		ctx.Status(http.StatusBadRequest).JSON(
			&fiber.Map{"msg":"could not get books"})
	}

	ctx.Status(http.StatusOK).JSON(
		&fiber.Map{"msg": "book fetched successfully",
		"data":bookModels})
	return nil
}

func(r *Repos) GetBook(ctx *fiber.Ctx) error{
	bookModel := &models.Books{}
	id := ctx.Params("id")

	if id == ""{
		ctx.Status(http.StatusInternalServerError).JSON(
			&fiber.Map{"msg": "invalid id"})
		return nil
	}

	err := r.DB.Where("id = ?", id).First(bookModel).Error
	if err != nil{
		ctx.Status(http.StatusBadRequest).JSON(
			&fiber.Map{"msg": "something went wrong"})
		return err
	}

	ctx.Status(http.StatusOK).JSON(
		&fiber.Map{"msg": "fetched successfully", 
		"data": bookModel})
	return nil
}

func(r *Repos) DeleteBook(ctx *fiber.Ctx) error{
	bookModel := &models.Books{}
	id := ctx.Params("id")

	if id == ""{
		ctx.Status(http.StatusInternalServerError).JSON(
			&fiber.Map{"msg":"Provide the id"})
		return nil
	}

	err := r.DB.Delete(&bookModel, id).Error
	if err != nil{
		ctx.Status(http.StatusBadRequest).JSON(
			&fiber.Map{"msg": "Something went wrong"})
		return err
	}

	ctx.Status(http.StatusOK).JSON(
		&fiber.Map{"msg": "book deleted successfully"})
	return nil
}

func(r *Repos) SetupRoutes(app *fiber.App){
	api := app.Group("/api")
	app.Get("/", r.HomePage)
	api.Get("/books", r.GetBooks)
	api.Get("/book/:id", r.GetBook)
	api.Post("/createBook", r.CreateBook)
	api.Delete("/book/:id", r.DeleteBook)
}

func main(){
	app := fiber.New()
	err := godotenv.Load(".env")
	if err != nil{
		log.Fatal("env error")
	}
	
	config := &storage.Config{
		Host: os.Getenv("DB_HOST"),
		Port: os.Getenv("DB_PORT"),
		User: os.Getenv("DB_USER"),
		Password: os.Getenv("DB_PASSWORD"),
		SSLMode: os.Getenv("DB_SSLMODE"),
		DBName: os.Getenv("DB_DBNAME"),
	}

	db, err := storage.NewConnection(config)
	if err != nil{
		log.Fatal("Storage error")
	}

	err = models.MigrateBooks(db)
	if err != nil{
		log.Fatal("migrate error")
	}

	r := Repos{
		DB: db,
	}
	r.SetupRoutes(app)


	app.Listen(":8080")
}