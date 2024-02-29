package com.springboot.sampleproject.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sampleproject.Request.Request;
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
    public FlightBooking SavingData(@RequestBody FlightBooking flight) {
       return  service.creation(flight);
    }
    @GetMapping("/profile")
    public List<FlightBooking> detailsprinting() {
        return service.DataPrinting();
    }
    @GetMapping("/profilebyid/{userid}")
    public FlightBooking getMethodName(@PathVariable int userid) {
        return service.Id(userid);
    }
    @GetMapping("/profilespage/{pageno}/{pagesize}")
    public List<FlightBooking> getpage(@PathVariable int pageno, @PathVariable int pagesize) {
        return service.pagination(pageno, pagesize);
    }
    
    @GetMapping("/sorting/{username}")
    public List<FlightBooking> sortedlist(@PathVariable String username) {
        return service.sortingbyname(username);
    }
    
    @PutMapping("/profileupdate/{userid}")
    public FlightBooking dataupdating(@PathVariable int userid, @RequestBody FlightBooking flight) {
        return  service.update(userid, flight);
    }
    @DeleteMapping("/profiledelete/{userid}")
    public Boolean delete(@PathVariable int userid){
        return service.delete(userid);
    }
}
