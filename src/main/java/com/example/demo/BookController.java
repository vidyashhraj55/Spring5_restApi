//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//
//@RestController
//public class BookController {
//
//	
//	@Autowired
//	BookService bookservice;
//	
//	
//	
//	@GetMapping("/book/{id}")
//	public Mono<Book> getBook(@PathVariable String id) {
//		return bookservice.findById(id);
//	}
//	@GetMapping("/books")
//	public Flux<Book> getBooks() {
//		return bookservice.findAll();
//	}
// @PostMapping("/book")
// public Mono<Book> saveBook(@RequestBody Book book) {
//     
//     return  bookservice.save(book);
// }
// 	
// @DeleteMapping("/book/{id}")
// public Mono<Void>  deleteBook(@PathVariable String id){
//	 return bookservice.deleteById(id);
// }
//	
//}
