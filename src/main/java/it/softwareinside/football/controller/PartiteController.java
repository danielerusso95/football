package it.softwareinside.football.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.football.service.ServicePartite;

@RestController
public class PartiteController {
	
	
	@Autowired
	private ServicePartite service;
	
	
	
	@GetMapping("/api")
	public void metodo() throws IOException {
		service.takePartite();
	}

}
