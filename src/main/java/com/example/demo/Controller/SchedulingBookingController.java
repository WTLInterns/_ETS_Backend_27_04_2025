package com.example.demo.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.SchedulingBookingDTO;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Price;
import com.example.demo.Model.ScheduledDate;
import com.example.demo.Model.SchedulingBooking;
import com.example.demo.Service.PriceService;
import com.example.demo.Service.ScheduleBookingService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/schedule")
public class SchedulingBookingController {

    @Autowired
    private ScheduleBookingService scheduleBookingService;

    @Autowired
    private UserService userService;

    @Autowired
    private PriceService priceService;

    // @PostMapping("/confirmBooking")
    // public ResponseEntity<SchedulingBooking> createScheduleBooking(
    // @RequestParam int userId,
    // @RequestParam String pickUpLocation,
    // @RequestParam String dropLocation,
    // @RequestParam String time,
    // @RequestParam String returnTime,
    // @RequestParam String shiftTime,
    // @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) List<LocalDate>
    // dates
    // ) {
    // SchedulingBooking booking = scheduleBookingService.createSchedule(
    // userId,
    // pickUpLocation,
    // dropLocation,
    // time,
    // returnTime,
    // shiftTime,
    // dates
    // );

    // return ResponseEntity.ok(booking);
    // }

    // public SchedulingBooking confirmBooking(@RequestParam int userId,
    // @RequestParam String pickupLocation,
    // @RequestParam String dropLocation, @RequestParam String time, @RequestParam
    // String returnTime,
    // @RequestParam String cabType, @RequestParam String baseAmount, @RequestParam
    // String finalAmount,
    // @RequestParam String gst, String serviceCharge) {

    // }

    

    @GetMapping("/byUserId/{id}")
    public List<SchedulingBooking> getBookingByUserId(@PathVariable int id) {
        return this.scheduleBookingService.getBookingByUserId(id);
    }

    @GetMapping("/byUser/{id}")
    public List<SchedulingBookingDTO> getByUserId(@PathVariable int id) {
        return this.scheduleBookingService.findByUserId(id);
    }

    @GetMapping("/byVendorDriverId/{vendorDriverId}")
    public List<SchedulingBookingDTO> getByVendorDriverId(@PathVariable int vendorDriverId) {
        return this.scheduleBookingService.getBookingByVendorDriverId(vendorDriverId);
    }

    @PutMapping("/update-status/{userId}")
    public ResponseEntity<?> updateStatus(
            @PathVariable int userId,
            @RequestParam String date) {

        try {
            LocalDate localDate = LocalDate.parse(date);
            ScheduledDate updatedDate = scheduleBookingService.updateStatusByUserIdAndDate(userId, localDate);

            if (updatedDate != null) {
                return ResponseEntity.ok(updatedDate);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("No booking found with the given date for this user or date mismatch.");
            }
        } catch (DateTimeParseException e) {
            return ResponseEntity.badRequest().body("Invalid date format. Expected yyyy-MM-dd.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error while updating status: " + e.getMessage());
        }
    }


    @PostMapping("/etsCab1")
    public Map<String, Object> getCabChoose(@RequestParam String pickUpLocation, @RequestParam String dropLocation,
            @RequestParam String time, @RequestParam String returnTime, @RequestParam String shiftTime) {


    Map<String, Object> response = new HashMap<>();

     Price price = this.priceService.findPriceByPickupAndDrop(pickUpLocation, dropLocation);
     System.out.println(price);

     response.put("pickUpLocation", pickUpLocation);
     response.put("dropLocation", dropLocation);
     response.put("time", time);
     response.put("returnTime", returnTime);
     response.put("shiftTime", shiftTime);
     response.put("destinationState", price.getDesitnationState());
     response.put("destinationCity", price.getDestinationCity());
     response.put("sourceState", price.getSourceState());
     response.put("sourceCity", price.getSourceCity());
     response.put("hatchback", price.getHatchback());
     response.put("sedan", price.getSedan());
     response.put("suv", price.getSuv());
     response.put("distace", price.getDistance());
     return response;
                

   
    }

}
