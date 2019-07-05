package com.example.canyuva.db;

import com.example.canyuva.dto.Car;
import com.example.canyuva.dto.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class DbTest {

    @Autowired
    private static ApplicationContext app;
    private static DataSource ds;
    private static Connection conn;

    public static Connection connectDb() throws SQLException {
        app = new AnnotationConfigApplicationContext(DbConfig.class);
        ds = app.getBean("dataSource", DataSource.class);
        conn = ds.getConnection();
        return conn;
    }


    public static List<Engine> getEngineList() {
        List<Engine> engineList = new ArrayList<>();
        try (Connection conn = connectDb();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM ENGINE")) {
            while (rs.next()) {
                Engine e = new Engine();
                e.setId(rs.getInt(1));
                e.setType(rs.getString(2));
                engineList.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return engineList;
    }

    public static List<Car> getCarList() {

        List<Car> carList = new ArrayList<>();
        try (Connection conn = connectDb();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM CAR")) {
            while (rs.next()) {
                Car c = new Car();
                c.setId(rs.getInt(1));
                c.setBrand(rs.getString(2));
                int engineIndex = rs.getInt(3);
                Engine e = getEngineList().stream().filter(x -> x.getId() == engineIndex).findAny().get();
                c.setEngine(e);
                c.setYear(rs.getInt(4));
                carList.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carList;
    }

    public static void main(String[] args) {
        for (Car c : getCarList()) {
            System.out.println(c.getId() + " | " + c.getBrand() + " | " + c.getEngine() + " | " + c.getYear() + "\n");
        }


    }
}
