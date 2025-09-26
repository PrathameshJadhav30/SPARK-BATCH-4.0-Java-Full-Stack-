package com.Prathamesh.BookMyShow.service;

import com.Prathamesh.BookMyShow.dto.PaymentDto;
import com.Prathamesh.BookMyShow.exception.ResourceNotFoundException;
import com.Prathamesh.BookMyShow.model.Booking;
import com.Prathamesh.BookMyShow.model.Payment;
import com.Prathamesh.BookMyShow.repository.BookingRepository;
import com.Prathamesh.BookMyShow.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final BookingRepository bookingRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository, BookingRepository bookingRepository) {
        this.paymentRepository = paymentRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional
    public PaymentDto initiatePayment(Long bookingId, String paymentMethod) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + bookingId));

        Payment payment = new Payment();

        payment.setTransactionId("PENDING_" + System.currentTimeMillis());
        payment.setAmount(booking.getTotalAmount());
        payment.setPaymentTime(LocalDateTime.now());
        payment.setPaymentMethod(paymentMethod);
        payment.setStatus("PENDING");

        Payment savedPayment = paymentRepository.save(payment);

        booking.setPayment(savedPayment);
        booking.setStatus("PENDING_PAYMENT");
        bookingRepository.save(booking);

        return mapToDto(savedPayment);
    }

    @Transactional
    public PaymentDto finalizePayment(String tempTransactionId, String finalTransactionId, String finalStatus) {
        Payment payment = paymentRepository.findByTransactionId(tempTransactionId)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found with transaction ID: " + tempTransactionId));

        // Update Payment Status
        String status = finalStatus.toUpperCase();
        payment.setStatus(status);
        payment.setTransactionId(finalTransactionId); // Set the actual gateway ID
        Payment updatedPayment = paymentRepository.save(payment);

        // Update Booking Status
        Booking booking = updatedPayment.getBooking();
        if ("SUCCESS".equals(status)) {
            booking.setStatus("CONFIRMED");
        } else {
            booking.setStatus("CANCELLED");
        }
        bookingRepository.save(booking);

        return mapToDto(updatedPayment);
    }

    public PaymentDto getPaymentDetails(Long id) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found with id: " + id));
        return mapToDto(payment);
    }


    private PaymentDto mapToDto(Payment payment) {
        PaymentDto dto = new PaymentDto();
        dto.setId(payment.getId());
        dto.setTransactionId(payment.getTransactionId());
        dto.setAmount(payment.getAmount());
        dto.setPaymentTime(payment.getPaymentTime());
        dto.setPaymentMethod(payment.getPaymentMethod());
        dto.setStatus(payment.getStatus());
        return dto;
    }
}