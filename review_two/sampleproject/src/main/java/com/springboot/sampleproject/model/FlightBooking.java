package com.springboot.sampleproject.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userid;
    String username;
    String email;
    String password;
    String phonenumber;
    @OneToMany(
        targetEntity = Mytrip.class, 
        cascade = CascadeType.ALL)
    @JoinColumn(name = "arrivalid", referencedColumnName = "Userid")
    private List<Mytrip> travellist;

     
    
    

    
}
