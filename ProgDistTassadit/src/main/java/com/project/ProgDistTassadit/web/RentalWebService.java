package com.project.ProgDistTassadit.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RentalWebService {
    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }

    @GetMapping("/bonjour_new")
    public String disReBonjour() {
        return "ReBonjour !";
    }

    @GetMapping("/cars/rentalNumber")
    public String getRentalNumbers() {
        logger.info("Rental Numbers requested");
        return "List of rental numbers";
    }

    @GetMapping("/cars/{plateNumber}")
    public String getOneCar(@PathVariable("plateNumber") String plateNumber) {
        logger.info("Requested one car: " + plateNumber);
        return "Car details for plate number: " + plateNumber;
    }
}
