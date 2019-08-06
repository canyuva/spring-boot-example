package com.canyuva.springh2example.controller;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/get-cars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }


}
