package com.springboot.sampleproject.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    //to save all the datas 
    @SuppressWarnings("null")
    public FlightBooking creation(FlightBooking flight)
    {
        return repo.save(flight);
    }
    //to print all the datas
    public List<FlightBooking> DataPrinting(){
        return repo.findAll();
    }
    //to get the data by id
    public FlightBooking Id(int userid){
        return repo.findById(userid).orElse(null);

    }
    // to update the data using id (put method)
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
    //pagination
    public List<FlightBooking> pagination(int pageno, int pagesize){
        PageRequest ticketpage = PageRequest.of(pageno, pagesize);
        return repo.findAll(ticketpage).get().toList();
    }
    //sorting 
    public List<FlightBooking> sortingbyname(String username)
    {
        return repo.findAll(Sort.by(Sort.Direction.DESC,username));
    }
    //pagination by name 
    // public List<FlightBooking> paginationofname(String name, int pageno, int pagesize)
    // {
    //     PageRequest pageByName = PageRequest.of(pageno, pagesize);
    //     return repo.pageByName(name, pageByName);
    // }
    
}
