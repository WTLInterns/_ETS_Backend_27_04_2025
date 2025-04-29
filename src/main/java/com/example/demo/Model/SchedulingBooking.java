package com.example.demo.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SchedulingBooking {
    


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String pickUpLocation;

    private String dropLocation;

    private String time;

    private String returnTime;

    private String shiftTime;

    private List<LocalDate> dateOfList;

    private String bookingType="SCHEDULE";

    public SchedulingBooking(int id, String pickUpLocation, String dropLocation, String time, String returnTime,
            String shiftTime, List<LocalDate> dateOfList, String bookingType) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.time = time;
        this.returnTime = returnTime;
        this.shiftTime = shiftTime;
        this.dateOfList = dateOfList;
        this.bookingType=bookingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
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

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public List<LocalDate> getDateOfList() {
        return dateOfList;
    }

    public void setDateOfList(List<LocalDate> dateOfList) {
        this.dateOfList = dateOfList;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    

    
    
}
