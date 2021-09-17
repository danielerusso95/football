package it.softwareinside.football.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.football.model.BetPrediction;
import it.softwareinside.football.model.Partite;
import it.softwareinside.football.service.ServicePartite;
import it.softwareinside.football.service.ServicePrediction;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PartiteController {


	@Autowired
	private ServicePartite service;

	@Autowired
	private ServicePrediction predictionService;

	@GetMapping("/all/prediction")
	public List<BetPrediction> allPrediction() throws IOException {
		return predictionService.predictions();
	}

	@GetMapping("/all")
	public List<Partite> metodoFill() throws IOException {
		return service.partite();
	}

	@GetMapping("/partita/{partita}")
	public List<Partite> metodoPartite(@PathVariable String partita){
		return service.trovaPartite(partita);
	}

	@GetMapping("/competizione/{competizione}")
	public List<Partite> metodoCompetizione(@PathVariable String competizione){
		return service.trovaCampionato(competizione);
	}

	@GetMapping("/date/{date}")
	public List<Partite> metodoDate(@PathVariable String date){
		return service.trovaData(date);
	}

}
