package me.wslian.cloud.controller;

import me.wslian.cloud.model.Book;
import me.wslian.cloud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private BookRepository repository;

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1/book", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Book> getAll() {
        return repository.findAll();
    }
}
