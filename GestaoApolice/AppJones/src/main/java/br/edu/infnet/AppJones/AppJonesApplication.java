package br.edu.infnet.AppJones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppJonesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppJonesApplication.class, args);
	}

}
