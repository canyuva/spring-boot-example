package com.canyuva.springh2example.services;

import com.canyuva.springh2example.dto.Engine;
import com.canyuva.springh2example.repos.EngineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EngineService {

    @Autowired
    private EngineRepo engineRepo;

    public List<Engine> getAllEngines(){
        List<Engine> engineList = new ArrayList<>();
        engineRepo.findAll().forEach(engineList::add);
        return engineList;
    }

}
