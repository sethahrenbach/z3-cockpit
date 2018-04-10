package edu.missouri.z3cockpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Z3CockpitApplication {

	public static void main(String[] args) {

		SpringApplication.run(Z3CockpitApplication.class, args);
	}
}
