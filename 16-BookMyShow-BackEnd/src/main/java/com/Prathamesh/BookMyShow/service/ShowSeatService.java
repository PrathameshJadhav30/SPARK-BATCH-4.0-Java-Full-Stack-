package com.Prathamesh.BookMyShow.service;

import com.Prathamesh.BookMyShow.dto.SeatDto;
import com.Prathamesh.BookMyShow.dto.ShowSeatDto;
import com.Prathamesh.BookMyShow.exception.ResourceNotFoundException;
import com.Prathamesh.BookMyShow.model.Show;
import com.Prathamesh.BookMyShow.model.ShowSeat;
import com.Prathamesh.BookMyShow.repository.ShowRepository;
import com.Prathamesh.BookMyShow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowSeatService {

    private final ShowSeatRepository showSeatRepository;
    private final ShowRepository showRepository;

    @Autowired
    public ShowSeatService(ShowSeatRepository showSeatRepository, ShowRepository showRepository) {
        this.showSeatRepository = showSeatRepository;
        this.showRepository = showRepository;
    }

    public List<ShowSeatDto> getShowSeatAvailability(Long showId) {
        List<ShowSeat> showSeats = showSeatRepository.findByShowId(showId);

        if (showSeats.isEmpty()) {
            throw new ResourceNotFoundException("No seats found for show id: " + showId);
        }
        return showSeats.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Transactional
    public List<ShowSeatDto> blockSeatsForBooking(Long showId, List<Long> showSeatIds) {
        Show show = showRepository.findById(showId)
                .orElseThrow(() -> new ResourceNotFoundException("Show not found with id: " + showId));

        List<ShowSeat> seatsToBlock = showSeatRepository.findAllById(showSeatIds);

        if (seatsToBlock.size() != showSeatIds.size() ||
                seatsToBlock.stream().anyMatch(seat -> !seat.getStatus().equals("AVAILABLE"))) {
            throw new RuntimeException("One or more selected seats are unavailable or already blocked.");
        }

        // Update status to BLOCKED
        seatsToBlock.forEach(seat -> {
            seat.setStatus("BLOCKED");
        });

        List<ShowSeat> blockedSeats = showSeatRepository.saveAll(seatsToBlock);
        return blockedSeats.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    private ShowSeatDto mapToDto(ShowSeat showSeat) {
        ShowSeatDto dto = new ShowSeatDto();
        dto.setId(showSeat.getId());
        dto.setStatus(showSeat.getStatus());
        dto.setPrice(showSeat.getPrice());

        SeatDto baseSeatDto = new SeatDto();
        baseSeatDto.setId(showSeat.getSeat().getId());
        baseSeatDto.setSeatNumber(showSeat.getSeat().getSeatNumber());
        baseSeatDto.setSeatType(showSeat.getSeat().getSeatType());
        baseSeatDto.setBasePrice(showSeat.getSeat().getBasePrice());

        dto.setSeat(baseSeatDto);
        return dto;
    }
}