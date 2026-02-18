# Name: Gatete Vanessa

# ID: 27274

# E-Commerce Product REST API – Full CRUD Implementation

## Project Description

This project implements a complete CRUD (Create, Read, Update, Delete) REST API for managing products in an e-commerce system using Spring Boot.

The system allows:

- Adding a new product
- Viewing all products
- Viewing a product by ID
- Updating a product
- Deleting a product

All endpoints were tested using Postman and screenshots were captured as proof of execution.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 / MySQL Database
- Postman

---

# CRUD Operations Implemented

---

## 1️ Create Product

**Endpoint**

```
POST /api/products/addProduct
```

This endpoint is used to add a new product to the database.

Process:

- It checks whether a product with the same ID already exists.
- If it exists, it returns a message.
- If not, the product is saved successfully.

### Screenshot

![Create Product](screenshots/Posted%20values.png)

---

## Retrieve All Products

**Endpoint**

```
GET /api/products/allProducts
```

This endpoint retrieves all products stored in the database.

It returns a list of products in JSON format.

### Screenshot

![Get All Products](screenshots/Getallproducts.png)

---

## Retrieve Product By ID

**Endpoint**

```
GET /api/products/getProduct/{id}
```

This endpoint retrieves a single product using its ID.

- If the product exists → it returns the product.
- If the product does not exist → it returns a not found message.

### Screenshot

![Get Product By ID](screenshots/GetproductbyId.png)

---

## Update Product

**Endpoint**

```
PUT /api/products/updateProduct/{id}
```

This endpoint updates an existing product.

Steps performed:

- Check if the product exists.
- If found, update fields (name, description, price, category, stockQuantity, brand).
- Save the updated product.
- Return success message.

### Screenshot

![Update Product](screenshots/updated%20object.png)

---

## Delete Product

**Endpoint**

```
DELETE /api/products/deleteProduct/{id}
```

This endpoint deletes a product from the database.

- If the product exists → it is deleted successfully.
- If not → it returns "Product with id not found".

### Screenshot

![Delete Product](screenshots/Deletedproduct.png)

---

# Conclusion

Each operation was tested using Postman, and screenshots were provided as evidence.

The API follows REST principles and ensures validation before updating or deleting data.
