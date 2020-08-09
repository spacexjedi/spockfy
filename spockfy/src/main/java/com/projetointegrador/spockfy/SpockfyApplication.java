package com.projetointegrador.spockfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SpockfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpockfyApplication.class, args);
	}

}
