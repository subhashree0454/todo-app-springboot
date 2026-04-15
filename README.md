# Todo List API with Thymeleaf & JWT

A production-ready full-stack Spring Boot application for managing Todos, featuring a hybrid SSR (Thymeleaf) and REST API (JWT) architecture.

## Features
- **User Authentication**: Secure registration and login using JWT.
- **Todo Management**: Complete CRUD operations (Create, Read, Update, Delete).
- **Advanced Filtering**: Search by title, pagination (10 per page), and sorting by creation date.
- **Premium UI**: Modern Bootstrap design with custom CSS variables and responsive layout.
- **Clean Architecture**: Layered structure with clear separation of concerns (Controller, Service, Repository, Entity, DTO).
- **Security Best Practices**: BCrypt password hashing, Stateless JWT, and Global Exception Handling.

## Tech Stack
- **Backend**: Spring Boot 3, Spring Security, Spring Data JPA
- **Frontend**: Thymeleaf, Bootstrap 5, JavaScript (Fetch API)
- **Database**: PostgreSQL
- **Build Tool**: Maven

## Prerequisites
- JDK 17+
- PostgreSQL database
- Maven

## Database Configuration
Update the `src/main/resources/application.properties` with your PostgreSQL credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Running the Application
1. Create the database `todo_db` in PostgreSQL.
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
3. Access the application at `http://localhost:8080/login`.

## API Endpoints
- `POST /api/auth/register` - Create a new account.
- `POST /api/auth/login` - Authenticate and get JWT.
- `GET /api/todos` - List user todos (supports `page`, `keyword`).
- `GET /api/todos/{id}` - Fetch single todo details.
- `POST /api/todos` - Create a new todo.
- `PUT /api/todos/{id}` - Update existing todo.
- `DELETE /api/todos/{id}` - Remove a todo.

## Project Structure
- `com.todo.controller`: MVC and REST controllers.
- `com.todo.service`: Business logic for Users and Todos.
- `com.todo.repository`: Data access with JpaRepository.
- `com.todo.entity`: Data models with Hibernate mappings.
- `com.todo.security`: JWT and Security configurations.
- `com.todo.dto`: Data transfer objects for API consistency.
- `com.todo.exception`: Global error handling.
