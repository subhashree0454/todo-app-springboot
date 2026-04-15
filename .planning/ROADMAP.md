# Roadmap: Todo List API with Thymeleaf & Spring Boot

## Phase 1: Project Setup & User Entity (Foundations)
- [ ] Initialize Spring Boot project (Maven)
- [ ] Configure PostgreSQL
- [ ] Create `User` entity, `UserRepository`, and `UserService`
- [ ] User registration API & Basic validation

## Phase 2: Security & JWT (Authentication)
- [ ] Configure Spring Security
- [ ] BCryptPasswordEncoder implementation
- [ ] JWT Utility class (Generate/Validate)
- [ ] JWT Authentication Filter
- [ ] Login API implementation

## Phase 3: Todo Entity & CRUD (API)
- [ ] Create `Todo` entity with `ManyToOne` relationship to `User`
- [ ] `TodoRepository`, `TodoService`, and `TodoController` (REST)
- [ ] User checking logic (only access own Items)
- [ ] Basic Todo validation

## Phase 4: Thymeleaf UI (Frontend)
- [ ] Setup Thymeleaf, MVC Controllers
- [ ] Login & Registration pages
- [ ] Dashboard page (List Todos)
- [ ] Create & Edit forms
- [ ] Bootstrap styling (Basic cleanup)

## Phase 5: Advanced Features & Pagination (Backend & UI)
- [ ] Pagination logic in backend (Pageable)
- [ ] Pagination controls in Thymeleaf
- [ ] Sorting by `createdAt` (desc)
- [ ] Filtering by keyword in title
- [ ] Error messages on UI (Validation)

## Phase 6: Polish & Finalization
- [ ] Global Exception Handling (API: RestControllerAdvice, UI: error.html)
- [ ] Data validation across all inputs
- [ ] Documentation (README.md)
- [ ] Cleanup and production-readiness check
