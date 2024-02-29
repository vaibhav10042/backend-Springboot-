package com.springboot.sampleproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mytrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int travelid;
    String arrival;
    String destination;
    String travelfare;
    String traveltime;
    

}
