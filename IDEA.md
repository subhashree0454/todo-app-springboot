# Todo List API with Thymeleaf & Spring Boot

## Tech Stack
* Spring Boot
* Spring MVC
* Spring Security with JWT authentication
* Spring Data JPA (Hibernate)
* Thymeleaf (server-side rendering frontend)
* PostgreSQL
* Maven

## Features
* User registration and login (UI + API)
* Secure authentication using JWT
* CRUD operations for Todo items
* Server-rendered UI using Thymeleaf
* Pagination, sorting, and filtering
* Input validation
* Global exception handling
* Clean layered architecture

## Database Design
* **User**: id, name, email (unique), password (hashed), createdAt
* **Todo**: id, title, description, createdAt, updatedAt, user (ManyToOne)

## Authentication
* BCryptPasswordEncoder
* JWT token stored in cookie/localStorage
* Send token in Authorization header: Bearer <token>
* JWT filter for request validation

## Key Routes
* **Auth**: /api/auth/register, /api/auth/login
* **Todos (API)**: /api/todos (CRUD, pagination, sorting, keyword filtering)
* **MVC (UI)**: /login, /register, /dashboard, /todos/create, /todos/edit/{id}

## Security & Best Practices
* Stateless JWT for APIs
* CSRF for Thymeleaf
* Secure password storage
* Token expiration
* Indexes for PostgreSQL (email, user_id)
