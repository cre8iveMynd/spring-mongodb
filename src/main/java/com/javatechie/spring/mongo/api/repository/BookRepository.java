package com.javatechie.spring.mongo.api.repository;

import com.javatechie.spring.mongo.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
