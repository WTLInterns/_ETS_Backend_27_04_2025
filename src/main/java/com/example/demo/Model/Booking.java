package com.example.demo.Model;

import jakarta.persistence.Entity;

@Entity
public class Booking {
    

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
