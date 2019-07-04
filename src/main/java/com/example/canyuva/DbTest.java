package com.example.canyuva;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@ComponentScan
public class DbTest {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DbConfig.class);
        DataSource ds = app.getBean("getDataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn.isClosed());

    }
}
