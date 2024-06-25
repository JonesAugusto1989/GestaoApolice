package br.edu.infnet.JonesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JonesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JonesApiApplication.class, args);
	}

}
