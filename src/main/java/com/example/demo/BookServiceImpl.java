package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	BookRepository bookRepo;
	
	
	@Override
	public Mono<Book> findById(String id) {
		return bookRepo.findById(id);
	}

	@Override
	public Flux<Book> findAll() {
		return bookRepo.findAll();
	}

	@Override
	public Mono<Book> save(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return bookRepo.deleteById(id);
	}

}
