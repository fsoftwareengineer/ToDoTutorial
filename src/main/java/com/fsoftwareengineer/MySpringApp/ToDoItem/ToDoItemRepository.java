package com.fsoftwareengineer.MySpringApp.ToDoItem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoItemRepository extends MongoRepository<ToDoItem, String> {
}
