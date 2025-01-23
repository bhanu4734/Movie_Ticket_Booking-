package com.example.movie_ticket_booking.repository;



import com.example.movie_ticket_booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
