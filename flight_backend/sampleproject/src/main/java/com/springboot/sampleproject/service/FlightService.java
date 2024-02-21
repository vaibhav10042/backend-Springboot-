package com.springboot.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.sampleproject.model.FlightBooking;
import com.springboot.sampleproject.repository.FlightRepo;

@Service
public class FlightService {
    @Autowired
    FlightRepo repo;
    public FlightService(FlightRepo repo){
        this.repo =repo;
    }
    public FlightBooking creation(FlightBooking flight)
    {
        return repo.save(flight);
    }
    public List<FlightBooking> DataPrinting(){
        return repo.findAll();
    }
    public FlightBooking Id(int userid){
        return repo.findById(userid).orElse(null);

    }
    public FlightBooking update(int userid, FlightBooking flight){
        FlightBooking obj = repo.findById(userid).orElse(null);
        if(obj != null)
        {
            obj.setEmail(flight.getEmail());
            obj.setUsername(flight.getUsername());
            obj.setPassword(flight.getPassword());
            obj.setPhonenumber(flight.getPhonenumber());
             return repo.save(obj);
        }
        return flight;
    }
    public boolean delete(int userid){
        repo.deleteById(userid);
        return true;
    }
}
