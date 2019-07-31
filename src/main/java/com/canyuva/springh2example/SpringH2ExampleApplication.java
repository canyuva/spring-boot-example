package com.canyuva.springh2example;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.repos.CarJdbcRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringH2ExampleApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    final CarJdbcRepo repo;

    public SpringH2ExampleApplication(CarJdbcRepo repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringH2ExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (Car c: repo.findAllCars()) {
            System.out.println(c.getId()+"\n"+c.getBrand());
        }


    }
}
