package com.springboot.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sampleproject.model.FlightBooking;

@Repository
public interface FlightRepo extends JpaRepository<FlightBooking, Integer> {
    
}
