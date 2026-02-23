# Books REST API — CPSC449

## Base URL
http://localhost:8082/api

---

## Endpoints

### GET all books
GET /api/books

Returns a list of all books.

---

### GET book by ID
GET /api/books/{id}

Returns a single book by ID.

---

### CREATE book
POST /api/books

Creates a new book.

Example request body:
{
  "title": "Test Book",
  "author": "Alejandro",
  "price": 19.99
}

---

### UPDATE book (PUT)
PUT /api/books/{id}

Replaces all fields of an existing book.

---

### PARTIAL UPDATE (PATCH)
PATCH /api/books/{id}

Updates only the provided fields.

Example:
{
  "price": 25.0
}

---

### DELETE book
DELETE /api/books/{id}

Removes a book by ID.

---

### GET with pagination
GET /api/books/paged?page=0&size=5

Returns a subset of books using pagination.

---

### Advanced search (filter + sort + pagination)
GET /api/books/advanced?author=&sortBy=&order=&page=&size=

Features:
- Filter by author
- Sort results
- Paginate results
- Operations executed in correct order

Example:
GET /api/books/advanced?author=martin&sortBy=price&order=desc&page=0&size=3

---

## Postman Test Results
PUT - Update entire book
<img width="2558" height="1378" alt="image" src="https://github.com/user-attachments/assets/5077a381-3aa5-448b-8578-f35bc76e366d" />
PATCH - Partial update
<img width="2559" height="1379" alt="image" src="https://github.com/user-attachments/assets/ffc0dbef-02bd-4530-a19d-8b8e78a7f2ac" />
Delete - Remove book
<img width="2558" height="1378" alt="image" src="https://github.com/user-attachments/assets/3fbe06bf-286a-49d4-932e-167df7222384" />
Get with pagination
<img width="2559" height="1379" alt="image" src="https://github.com/user-attachments/assets/dafd5e7b-89e0-469d-bcb7-45f9039648bf" />
Advanced GET (Filter, Sort, Paginate)
<img width="2559" height="1379" alt="image" src="https://github.com/user-attachments/assets/87f74660-f855-464c-bfe4-dc55b690628b" />

