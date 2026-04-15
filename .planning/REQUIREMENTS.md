# Requirements: Todo List API with Thymeleaf & Spring Boot

## 1. Goal
Production-ready full-stack Spring Boot Todo application with JWT and Thymeleaf UI.

## 2. Personas
- **Guest**: Can register and login.
- **Member**: Can create, read, update, and delete their own todo items.

## 3. Scope
### 3.1 Authentication
- [ ] User Registration (Name, Email, Password)
- [ ] User Login (Email, Password)
- [ ] JWT token generation and storage (Cookie/LocalStorage)
- [ ] JWT filter for role/user validation
- [ ] Password hashing with BCrypt

### 3.2 Todo Management
- [ ] List Todos with Pagination (10 per page default)
- [ ] Sort Todos by `createdAt` or `title`
- [ ] Filter Todos by `keyword` (Searching in title)
- [ ] Create new Todo (Title, Description)
- [ ] Edit existing Todo (Title, Description)
- [ ] Delete Todo

### 3.3 UI (Thymeleaf)
- [ ] Login screen
- [ ] Registration screen
- [ ] Dashboard (Todo list + actions)
- [ ] Create form
- [ ] Edit form
- [ ] Responsive design with Bootstrap

### 3.4 API
- [ ] Register endpoint (`POST /api/auth/register`)
- [ ] Login endpoint (`POST /api/auth/login`)
- [ ] Todo endpoints (`GET /api/todos`, `POST /api/todos`, `PUT /api/todos/{id}`, `DELETE /api/todos/{id}`)
- [ ] Consistent response format: `{ success: true, data: {}, message: "" }`

### 3.5 Infrastructure
- [ ] PostgreSQL database integration
- [ ] Spring Data JPA
- [ ] Validation (Bean Validation)
- [ ] Global Exception Handling

## 4. Non-Functional Requirements
- [ ] Secure password storage
- [ ] Stateless API (JWT)
- [ ] User isolation (Users can only see/edit their own items)
- [ ] Performance: Database indexes on `email` and `user_id`

## 5. Constraints
- Java/Spring Boot
- Maven
- PostgreSQL
