package com.example.demo.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    private String finalAmount;

    private String baseAmount;

    private String gst;

    private String serviceCharge;

    private String pickupLocation;

    private String dropLocation;

    private String time;

    private String carType;

}
