package com.Prathamesh.LMS.service;

import com.Prathamesh.LMS.entity.Book;
import com.Prathamesh.LMS.entity.Loan;
import com.Prathamesh.LMS.entity.Member;
import com.Prathamesh.LMS.repository.BookRepository;
import com.Prathamesh.LMS.repository.LoanRepository;
import com.Prathamesh.LMS.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepo;
    private final BookRepository bookRepo;
    private final MemberRepository memberRepo;

    public LoanService(LoanRepository l, BookRepository b, MemberRepository m) {
        this.loanRepo = l; this.bookRepo = b; this.memberRepo = m;
    }

    public List<Loan> getActiveLoans() { return loanRepo.findByReturnedFalse(); }

    public Loan borrowBook(Long bookId, Long memberId, int days) {
        Book book = bookRepo.findById(bookId).orElseThrow();
        if (book.getAvailableCopies() <= 0)
            throw new RuntimeException("No copies available");
        Member member = memberRepo.findById(memberId).orElseThrow();

        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookRepo.save(book);

        Loan loan = new Loan(book, member, LocalDate.now(), LocalDate.now().plusDays(days));
        return loanRepo.save(loan);
    }

    public Loan returnBook(Long loanId) {
        Loan loan = loanRepo.findById(loanId).orElseThrow();
        if (loan.isReturned()) return loan;

        loan.setReturned(true);
        loan.getBook().setAvailableCopies(loan.getBook().getAvailableCopies() + 1);

        bookRepo.save(loan.getBook());
        return loanRepo.save(loan);
    }
}

