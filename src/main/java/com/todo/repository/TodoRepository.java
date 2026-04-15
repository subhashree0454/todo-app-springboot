package com.todo.repository;

import com.todo.entity.Todo;
import com.todo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Page<Todo> findByUserAndTitleContainingIgnoreCase(User user, String title, Pageable pageable);
    Page<Todo> findByUser(User user, Pageable pageable);
}
