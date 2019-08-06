package com.canyuva.springh2example.repos;

import com.canyuva.springh2example.dto.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Integer> {

}