package com.jordigarcia.libreria.controller;

import com.jordigarcia.libreria.persistence.repository.BookRepository;
import com.jordigarcia.libreria.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/")
    public void createBook(@RequestBody Book book){
        bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Integer id) {
        Book book = new Book();
        book.setBookId(id);
        bookRepository.delete(book);
    }

    @GetMapping
    public List<Book> selectBooks(){
        return bookRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable("id") Integer id) {
        book.setBookId(id);
        bookRepository.save(book);
    }
}
