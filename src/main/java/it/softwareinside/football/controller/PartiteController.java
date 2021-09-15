package it.softwareinside.football.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.football.model.Partite;
import it.softwareinside.football.service.ServicePartite;

@RestController
@RequestMapping("/api")
public class PartiteController {
	
	
	@Autowired
	private ServicePartite service;
	
	
	
	@GetMapping("/all")
	public List<Partite> metodo() throws IOException {
		return service.takePartite();
	}

}
