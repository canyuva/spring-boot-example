package com.canyuva.springh2example.services;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.repos.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    public List<Car> getAllCars(){
        List<Car> carList = new ArrayList<>();
        carRepo.findAll().forEach(carList::add);
        return carList;
    }
}
