package com.Prathamesh.LMS.service;

import com.Prathamesh.LMS.entity.Book;
import com.Prathamesh.LMS.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) { this.repo = repo; }

    public List<Book> getAll() { return repo.findAll(); }

    public Book save(Book b) { return repo.save(b); }

    public void delete(Long id) { repo.deleteById(id); }

    public Book getById(Long id) { return repo.findById(id).orElse(null); }

    public List<Book> search(String q) { return repo.findByTitleContainingIgnoreCase(q); }
}
