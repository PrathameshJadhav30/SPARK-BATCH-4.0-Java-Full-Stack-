package com.Prathamesh.BookMyShow.service;

import com.Prathamesh.BookMyShow.dto.ScreenDto;
import com.Prathamesh.BookMyShow.exception.ResourceNotFoundException;
import com.Prathamesh.BookMyShow.model.Screen;
import com.Prathamesh.BookMyShow.model.Theater;
import com.Prathamesh.BookMyShow.repository.ScreenRepository;
import com.Prathamesh.BookMyShow.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScreenService {

    private final ScreenRepository screenRepository;
    private final TheaterRepository theaterRepository;

    @Autowired
    public ScreenService(ScreenRepository screenRepository, TheaterRepository theaterRepository) {
        this.screenRepository = screenRepository;
        this.theaterRepository = theaterRepository;
    }

    public ScreenDto createScreen(ScreenDto screenDto, Long theaterId) {
        Theater theater = theaterRepository.findById(theaterId)
                .orElseThrow(() -> new ResourceNotFoundException("Theater not found with id: " + theaterId));

        Screen screen = mapToEntity(screenDto);
        screen.setTheater(theater);

        Screen savedScreen = screenRepository.save(screen);

        return mapToDto(savedScreen);
    }

    public ScreenDto getScreenById(Long id) {
        Screen screen = screenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Screen not found with id: " + id));
        return mapToDto(screen);
    }

    public List<ScreenDto> getScreensByTheater(Long theaterId) {
        List<Screen> screens = screenRepository.findByTheaterId(theaterId);
        return screens.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private ScreenDto mapToDto(Screen screen) {
        ScreenDto dto = new ScreenDto();
        dto.setId(screen.getId());
        dto.setName(screen.getName());
        dto.setTotalSeats(screen.getTotalSeats());
        return dto;
    }

    private Screen mapToEntity(ScreenDto screenDto) {
        Screen screen = new Screen();
        screen.setName(screenDto.getName());
        screen.setTotalSeats(screenDto.getTotalSeats());
        return screen;
    }
}