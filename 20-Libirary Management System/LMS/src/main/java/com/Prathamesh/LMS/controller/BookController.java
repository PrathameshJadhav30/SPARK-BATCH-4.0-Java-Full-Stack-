package com.Prathamesh.LMS.controller;

import com.Prathamesh.LMS.entity.Book;
import com.Prathamesh.LMS.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Book add(@RequestBody Book b) {
        return service.save(b);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book b) {
        Book existing = service.getById(id);
        if (existing == null) return null;
        existing.setTitle(b.getTitle());
        existing.setAuthor(b.getAuthor());
        existing.setIsbn(b.getIsbn());
        existing.setTotalCopies(b.getTotalCopies());
        existing.setAvailableCopies(b.getAvailableCopies());
        return service.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/search")
    public List<Book> search(@RequestParam String q) {
        return service.search(q);
    }
}