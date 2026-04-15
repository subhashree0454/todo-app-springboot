package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/todos/create")
    public String createTodo() {
        return "create-todo";
    }

    @GetMapping("/todos/edit/{id}")
    public String editTodo(@PathVariable Long id, Model model) {
        model.addAttribute("todoId", id);
        return "edit-todo";
    }
}
