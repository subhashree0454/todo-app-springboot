# 🚀 Premium Todo List Application | Spring Boot + JWT + Thymeleaf

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.4-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Security](https://img.shields.io/badge/Security-JWT-blue.svg)](https://jwt.io/)
[![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-336791.svg)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A production-ready, full-stack **Spring Boot** Todo List application designed with a robust **Clean Architecture**. This project demonstrates a hybrid fusion of **Thymeleaf** (Server-Side Rendering) and modern **JWT-based Stateless Authentication**, providing a seamless, secure, and high-performance user experience.

---

## 🌟 Key Features

- **🔐 Advanced Security**: Stateless JWT-based authentication combined with CSRF protection for Thymeleaf forms.
- **🏗️ Clean Architecture**: Decoupled layers (Controller, Service, Repository, Entity, DTO) ensuring maintainability and scalability.
- **♻️ Full CRUD Operations**: Secure Todo management with owner-based access control.
- **🔍 Smart Filtering & Search**: Real-time keyword search for todos with backend-powered pagination and sorting.
- **🎨 Premium UI/UX**: Modern glassmorphism-inspired design built with Bootstrap 5 and custom CSS variables.
- **📊 Optimized Database**: PostgreSQL integration with automatic auditing and strategic indexing.
- **🛡️ Global Exception Handling**: centralized error reporting for both REST APIs and UI routes.

---

## 🛠️ Technology Stack

- **Backend core**: Java 17, Spring Boot 3.2+
- **Security**: Spring Security, JJWT (JSON Web Token)
- **Data Layer**: Spring Data JPA, Hibernate, PostgreSQL
- **Frontend**: Thymeleaf, JavaScript (Fetch API), Bootstrap 5
- **Tooling**: Maven, Lombok, Jakarta Validation

---

## 🚀 Quick Start

### 1. Prerequisites
- **JDK 17** or higher
- **PostgreSQL** instance running
- **Maven** installed

### 2. Database Configuration
Create a database named `todo_db` and update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=YOUR_USER
spring.datasource.password=YOUR_PASSWORD
```

### 3. Build and Run
```bash
mvn clean install
mvn spring-boot:run
```
Navigate to `http://localhost:8080/login` to start managing your daily tasks!

---

## 📡 API Reference

### Authentication
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/auth/register` | Create a new user account |
| `POST` | `/api/auth/login` | Authenticate and retrieve JWT bearer token |

### Todo Management
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/todos` | List todos with pagination & keyword search |
| `GET` | `/api/todos/{id}` | Fetch detailed Todo object |
| `POST` | `/api/todos` | Create a new Todo item |
| `PUT` | `/api/todos/{id}` | Update existing Todo content |
| `DELETE` | `/api/todos/{id}` | Permanently delete a Todo item |

---

## 📁 Project Structure

```text
src/main/java/com/todo/
├── controller/   # REST APIs and MVC View Controllers
├── service/      # Business logic and user validation
├── repository/   # Spring Data JPA persistence interfaces
├── entity/       # JPA entities (User, Todo)
├── security/     # JWT filters and Security configurations
├── dto/          # Data Transfer Objects for API consistency
└── exception/    # Global Exception Handler and custom errors
```

---

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
*Developed with ❤️ for high-performance enterprise applications.*
