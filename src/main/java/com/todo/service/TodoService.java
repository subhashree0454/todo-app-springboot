package com.todo.service;

import com.todo.dto.TodoRequest;
import com.todo.dto.TodoResponse;
import com.todo.entity.Todo;
import com.todo.entity.User;
import com.todo.repository.TodoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Page<TodoResponse> getTodos(User user, String keyword, Pageable pageable) {
        Page<Todo> todoPage;
        if (keyword != null && !keyword.isEmpty()) {
            todoPage = todoRepository.findByUserAndTitleContainingIgnoreCase(user, keyword, pageable);
        } else {
            todoPage = todoRepository.findByUser(user, pageable);
        }
        return todoPage.map(this::mapToResponse);
    }

    public TodoResponse createTodo(User user, TodoRequest request) {
        Todo todo = Todo.builder()
                .title(request.title())
                .description(request.description())
                .user(user)
                .build();
        return mapToResponse(todoRepository.save(todo));
    }

    @Transactional
    public TodoResponse updateTodo(User user, Long id, TodoRequest request) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        if (!todo.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized access to this Todo");
        }

        todo.setTitle(request.title());
        todo.setDescription(request.description());
        return mapToResponse(todoRepository.save(todo));
    }

    public void deleteTodo(User user, Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        if (!todo.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized access to this Todo");
        }

        todoRepository.delete(todo);
    }

    public TodoResponse getTodoById(User user, Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        if (!todo.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized access to this Todo");
        }

        return mapToResponse(todo);
    }

    private TodoResponse mapToResponse(Todo todo) {
        return TodoResponse.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .description(todo.getDescription())
                .createdAt(todo.getCreatedAt())
                .updatedAt(todo.getUpdatedAt())
                .build();
    }
}
