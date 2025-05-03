package com.example.demo.DTO;


import java.time.LocalDate;
import java.util.List;

public class SchedulingBookingDTO {
    private int id;
    private String pickUpLocation;
    private String dropLocation;
    private String time;
    private String returnTime;
    private String shiftTime;
    private String bookingType;
    private List<LocalDate> dateOfList;

    private VendorDTO vendor;
    private VendorDriverDTO vendorDriver;
    private UserDTO user;
    private List<ScheduleDateBookingDTO> scheduledDates;


    public SchedulingBookingDTO(int id, String pickUpLocation, String dropLocation, String time, String returnTime,
            String shiftTime, String bookingType, List<LocalDate> dateOfList, VendorDTO vendor,
            VendorDriverDTO vendorDriver, UserDTO user, List<ScheduleDateBookingDTO> scheduledDates) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.time = time;
        this.returnTime = returnTime;
        this.shiftTime = shiftTime;
        this.bookingType = bookingType;
        this.dateOfList = dateOfList;
        this.vendor = vendor;
        this.vendorDriver = vendorDriver;
        this.user = user;
        this.scheduledDates = scheduledDates;
    }


    public SchedulingBookingDTO(){
        super();
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


    public String getBookingType() {
        return bookingType;
    }


    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }


    public List<LocalDate> getDateOfList() {
        return dateOfList;
    }


    public void setDateOfList(List<LocalDate> dateOfList) {
        this.dateOfList = dateOfList;
    }


    public VendorDTO getVendor() {
        return vendor;
    }


    public void setVendor(VendorDTO vendor) {
        this.vendor = vendor;
    }


    public VendorDriverDTO getVendorDriver() {
        return vendorDriver;
    }


    public void setVendorDriver(VendorDriverDTO vendorDriver) {
        this.vendorDriver = vendorDriver;
    }


    public UserDTO getUser() {
        return user;
    }


    public void setUser(UserDTO user) {
        this.user = user;
    }


    public List<ScheduleDateBookingDTO> getScheduledDates() {
        return scheduledDates;
    }


    public void setScheduledDates(List<ScheduleDateBookingDTO> scheduledDates) {
        this.scheduledDates = scheduledDates;
    }

    

    

    
}

    
