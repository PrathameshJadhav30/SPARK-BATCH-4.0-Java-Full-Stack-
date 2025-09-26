package com.Prathamesh.BookMyShow.repository;

import com.Prathamesh.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>
{

    Optional<Payment> findByTransactionId(String transactionId);

}
