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
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String tickets;
    int serial_no;
    String username;
    String from;
    String To;
    String price;
    String time;

}
