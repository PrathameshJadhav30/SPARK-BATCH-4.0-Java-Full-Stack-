package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.TheaterDto;
import com.Prathamesh.BookMyShow.service.TheaterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/theaters")
public class TheaterController {

    private final TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @PostMapping
    public ResponseEntity<TheaterDto> createTheater(@RequestBody TheaterDto theaterDto) {
        TheaterDto createdTheater = theaterService.createTheater(theaterDto);
        // Returns the created theater DTO with HTTP Status 201 (Created)
        return new ResponseEntity<>(createdTheater, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<TheaterDto> getTheaterById(@PathVariable Long id) {
        TheaterDto theater = theaterService.getTheaterById(id);
        return ResponseEntity.ok(theater);
    }

    @GetMapping
    public ResponseEntity<List<TheaterDto>> getAllTheaters() {
        List<TheaterDto> theaters = theaterService.getAllTheaters();
        return ResponseEntity.ok(theaters);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<TheaterDto>> getAllTheatersByCity(@PathVariable String city) {
        List<TheaterDto> theaters = theaterService.getAllTheaterByCity(city);
        return ResponseEntity.ok(theaters);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TheaterDto> updateTheater(@PathVariable Long id, @RequestBody TheaterDto theaterDto) {
        TheaterDto updatedTheater = theaterService.updateTheater(id, theaterDto);
        return ResponseEntity.ok(updatedTheater);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}