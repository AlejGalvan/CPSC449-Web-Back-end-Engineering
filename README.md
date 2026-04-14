# Assignment 2 - JWT Role-Based Authorization
### Overview
This project extends a secure Bookstore REST API built with Spring Boot and Spring Security by implementing role-based authorization using JWT (JSON Web Tokens).
The system supports two roles:
* USER - can view and create books
* ADMIN - has full privileges, including deleting books
The main enhancement in this assignment is restricying the DELETE operation to ADMIN users only.

### Authentication & Authorization
* Authentication is handled using JWT tokens
* Users must log in to receive a token
* The token must be included in requests using the Authorization header:
Authorization: Bearer <JWT_TOKEN>

### API Endpoints
Authentication
* POST /api/auth/register
  Register a new user with roles
* POST /api/auth/login
  Authenticate user and return JWT token

Books
* GET /api/books
  Retrieve all books (accessible to authenication users)
* POST /api/books
  Create a new book (USER role required)
* DELETE /api/books/{id}
  Delete a book by ID (ADMIN role required)
  * Returns 200 OK if successful
  * Returns 404 Not Found if book does not exist
  * Returns 403 Forbidden if users lacks ADMIN role

## Postman Test Results
1. Register Admin User
<img width="1535" height="770" alt="image" src="https://github.com/user-attachments/assets/fceb4bff-79ee-4d80-90fc-0ce2f03c1d29" />
2. Login Admin User
<img width="1534" height="825" alt="image" src="https://github.com/user-attachments/assets/47628c86-7741-43fd-9baa-feba11f48576" />
3. Create A Book As Admin
<img width="1533" height="1083" alt="image" src="https://github.com/user-attachments/assets/94277e8b-1d09-4294-b873-35e5c1449ef5" />
4. Test Scenario 1: ADMIN Can Delete
<img width="1533" height="742" alt="image" src="https://github.com/user-attachments/assets/004e1f70-93f1-4fd9-b869-98e0af8f884f" />
5. Register Regular USER
<img width="1535" height="748" alt="image" src="https://github.com/user-attachments/assets/23aa1bc3-1a11-402f-afe3-9596b101f29a" />
6. Login Regular USER
<img width="1534" height="775" alt="image" src="https://github.com/user-attachments/assets/a32d008f-ffb5-47b8-9497-558281e82003" />
7. Create Another Book for The USER Delete Test
<img width="1532" height="1068" alt="image" src="https://github.com/user-attachments/assets/6ce6ca94-9943-4ccf-850f-87d374d810bc" />
8. Test Scenario 2: User Cannot Delete
<img width="1536" height="753" alt="image" src="https://github.com/user-attachments/assets/dd0f6b2f-7767-4428-9bcd-16aeaa868dc7" />
9. Test 404 Not Found
<img width="1531" height="705" alt="image" src="https://github.com/user-attachments/assets/0e13644d-3914-402f-874a-9cda9315f8f9" />





"token": "eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJhZG1pbjQ0OSIsImlhdCI6MTc3NjEzNTUzNywiZXhwIjoxNzc2MjE5NTM3fQ.k11mS4uxmYFSXh9Z1MtC6eLo5scFPWX1TOvTXZQvAC57WB9lvhIcu7E5GHUaCE3Y"
