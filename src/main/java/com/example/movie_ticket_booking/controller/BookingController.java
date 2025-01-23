package com.example.movie_ticket_booking.controller;

import com.example.movie_ticket_booking.model.Booking;
import com.example.movie_ticket_booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }
}
