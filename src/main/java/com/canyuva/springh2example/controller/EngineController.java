package com.canyuva.springh2example.controller;

import com.canyuva.springh2example.dto.Engine;
import com.canyuva.springh2example.services.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EngineController {

    @Autowired
    private EngineService engineService;

    @RequestMapping("/get-engines")
    public List<Engine> getEngines(){
        return engineService.getAllEngines();
    }

}
