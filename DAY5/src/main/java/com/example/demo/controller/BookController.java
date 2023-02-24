package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;


@RestController
public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping("/book")
	public Boolean create(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/book")
	public List<Book> get(){
		return service.getBook();
	}
	
	@GetMapping("/book/{id}")
	public Optional<Book> getById(@PathVariable int id){
		return service.getBookById(id);
	}
	
	@DeleteMapping("/book/{id}")
	public Boolean delete(@RequestParam int id) {
		return service.deleteBookById(id);
	}
	
	@PutMapping("/book/{id}")
	public Book update(@PathVariable int id,@RequestBody Book book ) {
		return service.updateBookById(book);
	}
}