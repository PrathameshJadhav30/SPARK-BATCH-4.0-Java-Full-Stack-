package com.Prathamesh.BookMyShow.controller;

import com.Prathamesh.BookMyShow.dto.ScreenDto;
import com.Prathamesh.BookMyShow.service.ScreenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/screens")
public class ScreenController {

    private final ScreenService screenService;

    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }


    @PostMapping
    public ResponseEntity<ScreenDto> createScreen(
            @RequestBody ScreenDto screenDto,
            @RequestParam Long theaterId) {

        ScreenDto createdScreen = screenService.createScreen(screenDto, theaterId);
        return new ResponseEntity<>(createdScreen, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScreenDto> getScreenById(@PathVariable Long id) {
        ScreenDto screen = screenService.getScreenById(id);
        return ResponseEntity.ok(screen);
    }

    @GetMapping("/theater/{theaterId}")
    public ResponseEntity<List<ScreenDto>> getScreensByTheater(@PathVariable Long theaterId) {
        List<ScreenDto> screens = screenService.getScreensByTheater(theaterId);
        return ResponseEntity.ok(screens);
    }
}