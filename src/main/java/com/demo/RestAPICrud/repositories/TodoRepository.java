package com.demo.RestAPICrud.repositories;

import com.demo.RestAPICrud.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
