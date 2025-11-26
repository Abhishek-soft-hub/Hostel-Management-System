package com.example.Hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hostel.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
