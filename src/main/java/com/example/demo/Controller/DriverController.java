package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.Driver;
import com.example.demo.Service.CloudinaryService;
import com.example.demo.Service.DriverService;


@RestController
public class DriverController {
    

    @Autowired
    private DriverService driverService;

    @Autowired
    private CloudinaryService cloudinaryService;

    @PostMapping("/addDriver")
    public ResponseEntity<Driver> uploadDriver(@RequestParam(value="driverImg",required=false) MultipartFile driverImg,
                                               @RequestParam(value="licenseFrontImg",required=false) MultipartFile licenseFrontImg,
                                               @RequestParam(value="licenseBackImg",required=false) MultipartFile licenseBackImg,
                                               @RequestParam(value="idProofFrontImg",required=false) MultipartFile idProofFrontImg,
                                               @RequestParam(value="idProofBackImg",required=false) MultipartFile idProofBackImg,
                                               @RequestParam(value="pccFormImg",required=false) MultipartFile pccFormImg,
                                               @RequestParam(value="driverName",required=false) String driverName,
                                               @RequestParam(value="mobileNumber",required=false) Long mobileNumber,
                                               @RequestParam(value="dob",required=false) String dob,
                                               @RequestParam(value="licenseIdNum",required=false) String licenseIdNum,
                                               @RequestParam(value="licenseExpiryDate",required=false) Long licenseExpiryDate,
                                               @RequestParam(value="idProofType",required=false) String idProofType) throws IOException {

        // Upload images to Cloudinary (or other storage service)
        String driverImgUrl = cloudinaryService.upload(driverImg);
        String licenseFrontImgUrl = cloudinaryService.upload(licenseFrontImg);
        String licenseBackImgUrl = cloudinaryService.upload(licenseBackImg);
        String idProofFrontImgUrl = cloudinaryService.upload(idProofFrontImg);
        String idProofBackImgUrl = cloudinaryService.upload(idProofBackImg);
        String pccFormImgUrl = cloudinaryService.upload(pccFormImg);

        // Create Driver entity and save it to the database
        Driver driver = new Driver(driverName, mobileNumber, driverImgUrl, dob, licenseIdNum, licenseExpiryDate,
                licenseFrontImgUrl, licenseBackImgUrl, idProofType, idProofFrontImgUrl, idProofBackImgUrl, pccFormImgUrl);

        // Call the service to save the driver
        Driver savedDriver = driverService.saveDriver(driver);

        return new ResponseEntity<>(savedDriver, HttpStatus.CREATED);
    }
}
