package com.wsjsistema.wsjdscommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class WsjdscommerceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(WsjdscommerceApplication.class, args);
	}


}
