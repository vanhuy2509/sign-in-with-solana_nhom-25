package com.ps23708;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ps23708.entity.Account;

@SpringBootApplication
@EnableScheduling
public class internship_loginApplication {

	public static void main(String[] args) {
		SpringApplication.run(internship_loginApplication.class, args);
	}

}
