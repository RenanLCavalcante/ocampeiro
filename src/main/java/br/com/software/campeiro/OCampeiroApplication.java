package br.com.software.campeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"br.com.software.campeiro"})
public class OCampeiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(OCampeiroApplication.class, args);		
	}

}
