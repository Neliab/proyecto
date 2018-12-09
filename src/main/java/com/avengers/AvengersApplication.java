package com.avengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.avengers.agrupador.AVeterinario;

@SpringBootApplication
@ComponentScan ({"com.server", "com.server.config"})
@EnableJpaRepositories ("com.avengers.agrupador")
public class AvengersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvengersApplication.class, args);
	}
	
	
}
