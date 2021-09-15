package it.softwareinside.football;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FootballApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FootballApplication.class, args);
	}

}
