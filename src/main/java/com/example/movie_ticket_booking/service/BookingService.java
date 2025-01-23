package com.example.movie_ticket_booking.service;



import com.example.movie_ticket_booking.model.Booking;
import com.example.movie_ticket_booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
