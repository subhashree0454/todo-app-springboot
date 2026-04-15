package com.todo.dto;

import java.time.LocalDateTime;

public record TodoResponse(
    Long id,
    String title,
    String description,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
    public static class TodoResponseBuilder {
        private Long id;
        private String title;
        private String description;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public TodoResponseBuilder id(Long id) { this.id = id; return this; }
        public TodoResponseBuilder title(String title) { this.title = title; return this; }
        public TodoResponseBuilder description(String description) { this.description = description; return this; }
        public TodoResponseBuilder createdAt(LocalDateTime createdAt) { this.createdAt = createdAt; return this; }
        public TodoResponseBuilder updatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; return this; }
        public TodoResponse build() { return new TodoResponse(id, title, description, createdAt, updatedAt); }
    }

    public static TodoResponseBuilder builder() {
        return new TodoResponseBuilder();
    }
}
