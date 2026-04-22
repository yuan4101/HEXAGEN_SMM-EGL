package com.spring.app.controller;

import java.util.List;
import com.spring.app.model.Book;
import com.spring.app.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/GET")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
}