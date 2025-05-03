package com.example.demo.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class SchedulingBooking {
    


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String pickUpLocation;

    private String dropLocation;

    private String time;

    private String returnTime;

    private String cabType;

    private Long vendorId;

    private int vendorDriverId;

    @Transient  
    private Vendor vendor;

    private String baseAmount;

    private String finalAmount;

    private String serviceCharge;

    private String gst;

    private String distance;

    private int sittingExcepatation;

    @Transient  
    private VendorDriver vendorDriver;

    private String shiftTime;

    private List<LocalDate> dateOfList;

    private String bookingType="SCHEDULE";

      @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "schedulingBooking", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ScheduledDate> scheduledDates = new ArrayList<>();

    

    public SchedulingBooking(int id, String pickUpLocation, String dropLocation, String time, String returnTime,
            Long vendorId, int vendorDriverId, Vendor vendor, String baseAmount, String finalAmount,
            String serviceCharge, String gst, VendorDriver vendorDriver, String shiftTime, List<LocalDate> dateOfList,
            String bookingType, User user, List<ScheduledDate> scheduledDates, String cabType, String distance, int sittingExcepatation) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.time = time;
        this.returnTime = returnTime;
        this.vendorId = vendorId;
        this.vendorDriverId = vendorDriverId;
        this.vendor = vendor;
        this.baseAmount = baseAmount;
        this.finalAmount = finalAmount;
        this.serviceCharge = serviceCharge;
        this.gst = gst;
        this.vendorDriver = vendorDriver;
        this.shiftTime = shiftTime;
        this.dateOfList = dateOfList;
        this.bookingType = bookingType;
        this.user = user;
        this.scheduledDates = scheduledDates;
        this.cabType=cabType;
        this.distance=distance;
        this.sittingExcepatation=sittingExcepatation;
    }

    public SchedulingBooking(){
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ScheduledDate> getScheduledDates() {
        return scheduledDates;
    }

    public void setScheduledDates(List<ScheduledDate> scheduledDates) {
        this.scheduledDates = scheduledDates;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public int getVendorDriverId() {
        return vendorDriverId;
    }

    public void setVendorDriverId(int vendorDriverId) {
        this.vendorDriverId = vendorDriverId;
    }

    public VendorDriver getVendorDriver() {
        return vendorDriver;
    }

    public void setVendorDriver(VendorDriver vendorDriver) {
        this.vendorDriver = vendorDriver;
    }

    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getSittingExcepatation() {
        return sittingExcepatation;
    }

    public void setSittingExcepatation(int sittingExcepatation) {
        this.sittingExcepatation = sittingExcepatation;
    }

    

    


    

    
    

    

    

    
    
}
