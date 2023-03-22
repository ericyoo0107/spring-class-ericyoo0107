package com.jscode.jscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JscodeApplication.class, args);
    }

}
