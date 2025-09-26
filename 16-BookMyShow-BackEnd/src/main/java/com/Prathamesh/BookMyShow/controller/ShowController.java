package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.ShowDto;
import com.Prathamesh.BookMyShow.service.ShowService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @PostMapping
    public ResponseEntity<ShowDto> createShow(@RequestBody ShowDto showDto) {
        ShowDto createdShow = showService.creteShow(showDto);
        // Returns the created show DTO with HTTP Status 201 (Created)
        return new ResponseEntity<>(createdShow, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShowDto> getShowById(@PathVariable Long id) {
        ShowDto show = showService.getShowById(id);
        // Returns the show DTO with HTTP Status 200 (OK)
        return ResponseEntity.ok(show);
    }

    @GetMapping
    public ResponseEntity<List<ShowDto>> getAllShows() {
        List<ShowDto> shows = showService.getAllShows();
        // Returns the list of shows with HTTP Status 200 (OK)
        return ResponseEntity.ok(shows);
    }


    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<ShowDto>> getShowsByMovie(@PathVariable Long movieId) {
        List<ShowDto> shows = showService.getShowsByMovie(movieId);
        return ResponseEntity.ok(shows);
    }

    @GetMapping("/search")
    public ResponseEntity<List<ShowDto>> getShowsByMovieAndCity(
            @RequestParam(required = true) Long movieId,
            @RequestParam(required = true) String city) {

        List<ShowDto> shows = showService.getShowsByMovieAndCity(movieId, city);
        return ResponseEntity.ok(shows);
    }

    @GetMapping("/range")
    public ResponseEntity<List<ShowDto>> getShowsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {

        List<ShowDto> shows = showService.getShowsByDateRange(startDate, endDate);
        return ResponseEntity.ok(shows);
    }
}