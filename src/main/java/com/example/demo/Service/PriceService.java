package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Price;
import com.example.demo.Repository.PriceRepository;

@Service
public class PriceService {
    

    @Autowired
    private PriceRepository priceRepository;

    public Price addPrice(Price price){
        return this.priceRepository.save(
            price
        );
    }




    public Price findPriceByPickupAndDrop(String pickupLocation, String dropLocation) {
        if (pickupLocation == null || dropLocation == null) {
            throw new RuntimeException("Pickup and Drop locations must not be null.");
        }
    
        // Extract source city and state
        String[] pickupParts = pickupLocation.split(",");
        if (pickupParts.length < 2) {
            throw new RuntimeException("Invalid pickup location format. Expected format: City,State,Country");
        }
        String sourceCity = pickupParts[0].trim();
        String sourceState = pickupParts[1].trim();
    
        // Extract destination city and state
        String[] dropParts = dropLocation.split(",");
        if (dropParts.length < 2) {
            throw new RuntimeException("Invalid drop location format. Expected format: City,State,Country");
        }
        String destinationCity = dropParts[0].trim();
        String destinationState = dropParts[1].trim();
    
        // Find price from database
        Price price = priceRepository.findBySourceCityAndSourceStateAndDestinationCityAndDesitnationState(
                sourceCity, sourceState, destinationCity, destinationState
        );
    
        if (price != null) {
            return price;
        } else {
            // Return default hatchback, sedan, suv pricing
            Price defaultPrice = new Price();
            defaultPrice.setSourceCity(sourceCity);
            defaultPrice.setSourceState(sourceState);
            defaultPrice.setDestinationCity(destinationCity);
            defaultPrice.setDesitnationState(destinationState);
    
            // You can choose what carType you want to show by default
            defaultPrice.setHatchback(15);
            defaultPrice.setSedan(17);
            defaultPrice.setSuv(22);
    
            return defaultPrice;
        }
    }
    

}
