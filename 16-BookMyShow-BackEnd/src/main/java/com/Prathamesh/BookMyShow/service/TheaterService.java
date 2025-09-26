package com.Prathamesh.BookMyShow.service;

import com.Prathamesh.BookMyShow.dto.TheaterDto;
import com.Prathamesh.BookMyShow.exception.ResourceNotFoundException;
import com.Prathamesh.BookMyShow.model.Theater;
import com.Prathamesh.BookMyShow.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheaterService {

    private final TheaterRepository theaterRepository;

    @Autowired
    public TheaterService(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }


    public TheaterDto createTheater(TheaterDto theaterDto) {
        Theater theater = mapToEntity(theaterDto);
        Theater savedTheater = theaterRepository.save(theater);
        return mapToDto(savedTheater);
    }

    public TheaterDto getTheaterById(Long id) {
        Theater theater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Theater not found with id: " + id));
        return mapToDto(theater);
    }

    public List<TheaterDto> getAllTheaters() {
        List<Theater> theaters = theaterRepository.findAll();
        return theaters.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public List<TheaterDto> getAllTheaterByCity(String city) {
        List<Theater> theaters = theaterRepository.findByCity(city);
        return theaters.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    //update theater
    public TheaterDto updateTheater(Long id, TheaterDto theaterDto) {
        // First, find the existing theater or throw an exception
        Theater existingTheater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Theater not found with id: " + id));

        // Update the fields of the existing theater
        existingTheater.setName(theaterDto.getName());
        existingTheater.setCity(theaterDto.getCity());
        existingTheater.setAddress(theaterDto.getAddress());
        existingTheater.setTotalScreens(theaterDto.getTotalScreens());

        // Save the updated theater back to the database
        Theater updatedTheater = theaterRepository.save(existingTheater);

        // Map the updated entity back to a DTO and return it
        return mapToDto(updatedTheater);
    }

    //delete theater
    public void deleteTheater(Long id) {
        // Check if the theater exists before trying to delete it
        Theater theater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Theater not found with id: " + id));

        // Delete the theater
        theaterRepository.delete(theater);
    }


    private TheaterDto mapToDto(Theater theater) {
        TheaterDto theaterDto = new TheaterDto();
        theaterDto.setId(theater.getId());
        theaterDto.setName(theater.getName());
        theaterDto.setCity(theater.getCity());
        theaterDto.setAddress(theater.getAddress());
        theaterDto.setTotalScreens(theater.getTotalScreens());
        return theaterDto;
    }

    private Theater mapToEntity(TheaterDto theaterDto) {
        Theater theater = new Theater();
        theater.setName(theaterDto.getName());
        theater.setAddress(theaterDto.getAddress());
        theater.setCity(theaterDto.getCity());
        theater.setTotalScreens(theaterDto.getTotalScreens());
        return theater;
    }
}