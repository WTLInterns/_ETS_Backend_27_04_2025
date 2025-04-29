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

    private String bookingType= "INSTANT";

    public Booking(int bookingId, String finalAmount, String baseAmount, String gst, String serviceCharge,
            String pickupLocation, String dropLocation, String time, String carType, String bookingType) {
        this.bookingId = bookingId;
        this.finalAmount = finalAmount;
        this.baseAmount = baseAmount;
        this.gst = gst;
        this.serviceCharge = serviceCharge;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.time = time;
        this.carType = carType;
        this.bookingType = bookingType;
        this.bookingType=bookingType;
    }


    public Booking(){
        super();
    }


    public int getBookingId() {
        return bookingId;
    }


    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }


    public String getFinalAmount() {
        return finalAmount;
    }


    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }


    public String getBaseAmount() {
        return baseAmount;
    }


    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }


    public String getGst() {
        return gst;
    }


    public void setGst(String gst) {
        this.gst = gst;
    }


    public String getServiceCharge() {
        return serviceCharge;
    }


    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }


    public String getPickupLocation() {
        return pickupLocation;
    }


    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }


    public String getDropLocation() {
        return dropLocation;
    }


    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public String getCarType() {
        return carType;
    }


    public void setCarType(String carType) {
        this.carType = carType;
    }


    public String getBookingType() {
        return bookingType;
    }


    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }


    

    

}
