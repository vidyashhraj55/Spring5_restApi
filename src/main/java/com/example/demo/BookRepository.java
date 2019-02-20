package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository  extends ReactiveMongoRepository<Book,String>{

}
