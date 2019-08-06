package com.canyuva.springh2example;

import com.canyuva.springh2example.repos.CarRepo;
import com.canyuva.springh2example.repos.EngineRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringH2ExampleApplication implements CommandLineRunner {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private EngineRepo engineRepo;

    private static final Logger logger = LoggerFactory.getLogger(SpringH2ExampleApplication.class);
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        SpringApplication.run(SpringH2ExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Select an option ...");
        System.out.println("1- Get all car list");
        System.out.println("1- Get all engine list");
        switch (sc.nextInt()) {
            case 1:
                logger.info("All cars 1 -> {}", carRepo.findAll());
                break;
            case 2:
                logger.info("All engines 1 -> {}", engineRepo.findAll());
                break;
            default:
                break;
        }
    }
}
