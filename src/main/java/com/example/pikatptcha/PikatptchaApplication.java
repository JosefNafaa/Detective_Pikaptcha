package com.example.pikatptcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pikatptcha.main.Principale;

@SpringBootApplication
public class PikatptchaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PikatptchaApplication.class, args);
		Principale.main(args);
	}

}
