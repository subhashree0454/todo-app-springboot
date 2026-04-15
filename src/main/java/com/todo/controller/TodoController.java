package com.todo.controller;

import com.todo.dto.ApiResponse;
import com.todo.dto.TodoRequest;
import com.todo.dto.TodoResponse;
import com.todo.entity.User;
import com.todo.service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<ApiResponse<Page<TodoResponse>>> getTodos(
            @AuthenticationPrincipal User user,
            @RequestParam(required = false) String keyword,
            @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        Page<TodoResponse> todos = todoService.getTodos(user, keyword, pageable);
        return ResponseEntity.ok(ApiResponse.success(todos, "Todos fetched successfully"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<TodoResponse>> getTodoById(
            @AuthenticationPrincipal User user,
            @PathVariable Long id
    ) {
        TodoResponse todo = todoService.getTodoById(user, id);
        return ResponseEntity.ok(ApiResponse.success(todo, "Todo fetched successfully"));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<TodoResponse>> createTodo(
            @AuthenticationPrincipal User user,
            @Valid @RequestBody TodoRequest request
    ) {
        TodoResponse todo = todoService.createTodo(user, request);
        return ResponseEntity.ok(ApiResponse.success(todo, "Todo created successfully"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<TodoResponse>> updateTodo(
            @AuthenticationPrincipal User user,
            @PathVariable Long id,
            @Valid @RequestBody TodoRequest request
    ) {
        TodoResponse todo = todoService.updateTodo(user, id, request);
        return ResponseEntity.ok(ApiResponse.success(todo, "Todo updated successfully"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteTodo(
            @AuthenticationPrincipal User user,
            @PathVariable Long id
    ) {
        todoService.deleteTodo(user, id);
        return ResponseEntity.ok(ApiResponse.success(null, "Todo deleted successfully"));
    }
}
