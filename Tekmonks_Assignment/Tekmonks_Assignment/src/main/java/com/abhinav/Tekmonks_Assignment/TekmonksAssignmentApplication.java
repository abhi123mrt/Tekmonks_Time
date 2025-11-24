package com.abhinav.Tekmonks_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})
public class TekmonksAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TekmonksAssignmentApplication.class, args);
	}

}
