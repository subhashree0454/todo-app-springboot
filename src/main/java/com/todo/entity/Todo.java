package com.todo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "todos", indexes = {
    @Index(name = "idx_todo_user_id", columnList = "user_id")
})
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Todo() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    // Manual Builder
    public static TodoBuilder builder() {
        return new TodoBuilder();
    }

    public static class TodoBuilder {
        private String title;
        private String description;
        private User user;

        public TodoBuilder title(String title) { this.title = title; return this; }
        public TodoBuilder description(String description) { this.description = description; return this; }
        public TodoBuilder user(User user) { this.user = user; return this; }
        public Todo build() {
            Todo todo = new Todo();
            todo.setTitle(title);
            todo.setDescription(description);
            todo.setUser(user);
            return todo;
        }
    }
}
