package com.wjy.dbutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DbutilApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbutilApplication.class, args);
	}

}
