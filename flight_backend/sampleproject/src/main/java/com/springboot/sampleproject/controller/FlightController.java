package com.springboot.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sampleproject.model.FlightBooking;
import com.springboot.sampleproject.service.FlightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/flightticketbooking")

public class FlightController {
    @Autowired
    FlightService service;
    public FlightController(FlightService service){
        this.service =service;
    }
    @PostMapping("/signup")
    public ResponseEntity<FlightBooking> SavingData(@RequestBody FlightBooking Flight) {
       return new ResponseEntity<>(service.creation(Flight), HttpStatus.CREATED);
    }
    @GetMapping("/profile")
    public ResponseEntity<List<FlightBooking>> detailsprinting() {
        return new ResponseEntity<>(service.DataPrinting(), HttpStatus.OK);
    }
    @PutMapping("/profileupdate/{userid}")
    public ResponseEntity<FlightBooking> dataupdating(@PathVariable int userid, @RequestBody FlightBooking flight) {
        return new ResponseEntity<>(service.update(userid, flight), HttpStatus.OK);
    }
    @DeleteMapping("/profiledelete/{userid}")
    public ResponseEntity<Boolean> delete(@PathVariable int userid){
        return new ResponseEntity<>(service.delete(userid), HttpStatus.OK);
    }
    

}
