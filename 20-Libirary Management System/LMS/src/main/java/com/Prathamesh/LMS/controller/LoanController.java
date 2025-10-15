package com.Prathamesh.LMS.controller;

import com.Prathamesh.LMS.entity.Loan;
import com.Prathamesh.LMS.service.LoanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@CrossOrigin(origins = "*")
public class LoanController {

    private final LoanService service;
    public LoanController(LoanService service) { this.service = service; }

    @GetMapping
    public List<Loan> getAll() { return service.getActiveLoans(); }

    @PostMapping("/borrow")
    public Loan borrow(@RequestParam Long bookId, @RequestParam Long memberId, @RequestParam(defaultValue = "14") int days) {
        return service.borrowBook(bookId, memberId, days);
    }

    @PostMapping("/return/{id}")
    public Loan returnBook(@PathVariable Long id) {
        return service.returnBook(id);
    }
}
