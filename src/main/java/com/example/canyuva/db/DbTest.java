package com.example.canyuva.db;

import com.example.canyuva.dto.Engine;
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

    private static AnnotationConfigApplicationContext app;
    private static DataSource ds;
    private static Connection conn;
    private static Statement stmt;

    public static Connection connectDb() throws SQLException {
        app = new AnnotationConfigApplicationContext(DbConfig.class);
        ds = app.getBean("getDataSource",DataSource.class);
        conn = ds.getConnection();
        return conn;
    }


    public static List<Engine> getEngineList() throws SQLException {
        conn = connectDb();
        stmt = conn.createStatement();
        String sql = "SELECT * FROM ENGINE";
        ResultSet rs = stmt.executeQuery(sql);
        List<Engine> engineList = new ArrayList<>();

        while(rs.next()){
            Engine e = new Engine();
            e.setId(rs.getInt(1));
            e.setType(rs.getString(2));
            engineList.add(e);
        }
        return engineList;
    }

    public static void main(String[] args) throws SQLException {
        for (Engine e: getEngineList()) {
            System.out.println(e.getId()+"  "+e.getType());
        }
    }
}
