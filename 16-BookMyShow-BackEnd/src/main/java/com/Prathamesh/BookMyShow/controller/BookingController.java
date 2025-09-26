package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.BookingDto;
import com.Prathamesh.BookMyShow.dto.BookingRequestDto;
import com.Prathamesh.BookMyShow.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingDto> createBooking(@Valid @RequestBody BookingRequestDto bookingRequest)
    {
        return new ResponseEntity<>(bookingService.createBooking(bookingRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDto> getBookingById(@PathVariable Long id)
    {
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }
}