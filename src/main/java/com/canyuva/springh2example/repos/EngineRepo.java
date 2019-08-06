package com.canyuva.springh2example.repos;

import com.canyuva.springh2example.dto.Engine;
import org.springframework.data.repository.CrudRepository;

public interface EngineRepo extends CrudRepository<Engine, Integer> {

}
