package it.softwareinside.football;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
@EnableAdminServer
@EnableSwagger2
public class FootballApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FootballApplication.class, args);
	}

}
