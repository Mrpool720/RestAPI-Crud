package com.demo.RestAPICrud.services;

import com.demo.RestAPICrud.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoByID(Long id);
    Todo insert(Todo todo);

    void updateTodo(Long id, Todo Todo);
    void deleteTodo(Long todoId);
}
