package com.example.demo.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Price {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String sourceCity;

    private String sourceState;

    private String desitnationState;

    private String destinationCity;

    private int hatchback;   // 15

    private int sedan;       // 17 

    private int suv;        //22

    public Price(int id, String sourceCity, String sourceState, String desitnationState, String destinationCity,
            int hatchback, int sedan, int suv) {
        this.id = id;
        this.sourceCity = sourceCity;
        this.sourceState = sourceState;
        this.desitnationState = desitnationState;
        this.destinationCity = destinationCity;
        this.hatchback = hatchback;
        this.sedan = sedan;
        this.suv = suv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getSourceState() {
        return sourceState;
    }

    public void setSourceState(String sourceState) {
        this.sourceState = sourceState;
    }

    public String getDesitnationState() {
        return desitnationState;
    }

    public void setDesitnationState(String desitnationState) {
        this.desitnationState = desitnationState;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    
    

    public int getHatchback() {
        return hatchback;
    }

    public void setHatchback(int hatchback) {
        this.hatchback = hatchback;
    }

    public int getSedan() {
        return sedan;
    }

    public void setSedan(int sedan) {
        this.sedan = sedan;
    }

    public int getSuv() {
        return suv;
    }

    public void setSuv(int suv) {
        this.suv = suv;
    }

    public Price(){
        super();
    }

    
}
