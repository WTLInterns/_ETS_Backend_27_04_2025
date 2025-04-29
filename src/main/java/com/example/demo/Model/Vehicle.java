package com.example.demo.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNo;
    private String vehicleCategory;
    private String brand;
    private String modelType;
    private String fuelType;
    private String vehicleOwnership;
    private Date registrationDate;
    private Date insuranceValidUpto;

    private String insuranceImageCopy; // Cloudinary URL
    private String registrationCertificateFront; // Cloudinary URL
    private String registrationCertificateBack; // Cloudinary URL
    private String carNumberPhoto; // Cloudinary URL

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getVehicleNo() { return vehicleNo; }
    public void setVehicleNo(String vehicleNo) { this.vehicleNo = vehicleNo; }
    public String getVehicleCategory() { return vehicleCategory; }
    public void setVehicleCategory(String vehicleCategory) { this.vehicleCategory = vehicleCategory; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModelType() { return modelType; }
    public void setModelType(String modelType) { this.modelType = modelType; }
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public String getVehicleOwnership() { return vehicleOwnership; }
    public void setVehicleOwnership(String vehicleOwnership) { this.vehicleOwnership = vehicleOwnership; }
    public Date getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(Date registrationDate) { this.registrationDate = registrationDate; }
    public Date getInsuranceValidUpto() { return insuranceValidUpto; }
    public void setInsuranceValidUpto(Date insuranceValidUpto) { this.insuranceValidUpto = insuranceValidUpto; }
    public String getInsuranceImageCopy() { return insuranceImageCopy; }
    public void setInsuranceImageCopy(String insuranceImageCopy) { this.insuranceImageCopy = insuranceImageCopy; }
    public String getRegistrationCertificateFront() { return registrationCertificateFront; }
    public void setRegistrationCertificateFront(String registrationCertificateFront) { this.registrationCertificateFront = registrationCertificateFront; }
    public String getRegistrationCertificateBack() { return registrationCertificateBack; }
    public void setRegistrationCertificateBack(String registrationCertificateBack) { this.registrationCertificateBack = registrationCertificateBack; }
    public String getCarNumberPhoto() { return carNumberPhoto; }
    public void setCarNumberPhoto(String carNumberPhoto) { this.carNumberPhoto = carNumberPhoto; }
}
