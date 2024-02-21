package com.springboot.sampleproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userid;
    String Username;
    String Email;
    @JsonIgnore
    String Password;
    String Phonenumber;
    public FlightBooking() {
    }
    public FlightBooking(String username, String email, String password, String phonenumber) {
        Username = username;
        Email = email;
        Password = password;
        Phonenumber = phonenumber;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getPhonenumber() {
        return Phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }
    

    
}
