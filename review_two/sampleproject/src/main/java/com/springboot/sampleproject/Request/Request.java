package com.springboot.sampleproject.Request;

import com.springboot.sampleproject.model.FlightBooking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Request {
    private FlightBooking obj;
}
