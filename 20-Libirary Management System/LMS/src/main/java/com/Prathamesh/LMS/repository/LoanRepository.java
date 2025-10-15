package com.Prathamesh.LMS.repository;

import com.Prathamesh.LMS.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByReturnedFalse();
}
