package com.canyuva.springh2example.repos;

import com.canyuva.springh2example.dto.Car;
import com.canyuva.springh2example.dto.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EngineJdbcRepo {

    private final JdbcTemplate jdbcTemplate;

    public EngineJdbcRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    class EngineRowMapper implements RowMapper<Engine> {
        @Override
        public Engine mapRow(ResultSet rs, int rowNum) throws SQLException {
            Engine engine = new Engine();
            engine.setId(rs.getInt("ENGINE_ID"));
            engine.setType(rs.getString("ENGINE_TYPE"));
            return engine;
        }
    }

    public List< Engine > findAllEngines() {
        return jdbcTemplate.query("select * from ENGINE", new EngineRowMapper());
    }

}
