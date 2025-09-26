package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.PaymentDto;
import com.Prathamesh.BookMyShow.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/initiate")
    public ResponseEntity<PaymentDto> initiatePayment(
            @RequestParam Long bookingId,
            @RequestParam String method) {

        PaymentDto payment = paymentService.initiatePayment(bookingId, method);
        return new ResponseEntity<>(payment, HttpStatus.ACCEPTED);
    }

    @PostMapping("/finalize")
    public ResponseEntity<PaymentDto> finalizePayment(
            @RequestParam String tempTransactionId,
            @RequestParam String finalTransactionId,
            @RequestParam String finalStatus) {

        PaymentDto updatedPayment = paymentService.finalizePayment(tempTransactionId, finalTransactionId, finalStatus);
        return ResponseEntity.ok(updatedPayment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> getPaymentDetails(@PathVariable Long id) {
        PaymentDto payment = paymentService.getPaymentDetails(id);
        return ResponseEntity.ok(payment);
    }
}