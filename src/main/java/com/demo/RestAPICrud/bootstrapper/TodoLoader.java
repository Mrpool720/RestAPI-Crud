package com.demo.RestAPICrud.bootstrapper;

import com.demo.RestAPICrud.model.Todo;
import com.demo.RestAPICrud.model.TodoStatus;
import com.demo.RestAPICrud.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class TodoLoader implements CommandLineRunner {

    public final TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        loadTodos();

    }

    private void loadTodos() {

        if (todoRepository.count() == 0) {
            todoRepository.save(
                    Todo.builder()
                            .title("Go to Market")
                            .description("Buy 12 eggs.")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );

            todoRepository.save(
                    Todo.builder()
                            .title("Get a Job.")
                            .description("Earn money")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            System.out.println("Sample Todos Loaded.");
        }
    }
}
