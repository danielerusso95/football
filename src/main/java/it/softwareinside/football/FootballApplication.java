package it.softwareinside.football;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.softwareinside.football.service.ServicePartite;

@SpringBootApplication
public class FootballApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FootballApplication.class, args);
	}

}
