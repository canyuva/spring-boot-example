package com.canyuva.springh2example.repos;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.dto.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ComponentScan
@Repository
public class CarJdbcRepo {

    private final JdbcTemplate jdbcTemplate;

    public CarJdbcRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    class CarRowMapper implements RowMapper< Car > {
        @Override
        public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
            Car car = new Car();
            car.setId(rs.getInt("CAR_ID"));
            car.setBrand(rs.getString("CAR_BRAND"));
            int engineIndex = rs.getInt("CAR_ENGINE_FK");
            EngineJdbcRepo engineRepo = new EngineJdbcRepo(jdbcTemplate);
            Engine e = engineRepo.findAllEngines().stream().filter(x -> x.getId() == engineIndex).findAny().get();
            car.setEngine(e);
            car.setYear(rs.getInt("CAR_YEAR"));
            return car;
        }
    }
    public List< Car > findAllCars() {
        return jdbcTemplate.query("select * from CAR", new CarRowMapper());
    }

}