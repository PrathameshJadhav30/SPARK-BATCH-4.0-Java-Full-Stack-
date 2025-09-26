package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.ShowSeatDto;
import com.Prathamesh.BookMyShow.service.ShowSeatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/showseats")
public class ShowSeatController {

    private final ShowSeatService showSeatService;

    public ShowSeatController(ShowSeatService showSeatService) {
        this.showSeatService = showSeatService;
    }

    @GetMapping("/show/{showId}")
    public ResponseEntity<List<ShowSeatDto>> getShowSeatAvailability(@PathVariable Long showId) {
        List<ShowSeatDto> seats = showSeatService.getShowSeatAvailability(showId);
        return ResponseEntity.ok(seats);
    }
    @PostMapping("/block")
    public ResponseEntity<List<ShowSeatDto>> blockSeats(
            @RequestParam Long showId,
            @RequestBody List<Long> showSeatIds) {

        List<ShowSeatDto> blockedSeats = showSeatService.blockSeatsForBooking(showId, showSeatIds);
        return new ResponseEntity<>(blockedSeats, HttpStatus.OK);
    }
}