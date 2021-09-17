package it.softwareinside.football.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BetPrediction {

	String home_team;
	String away_team;
	long id;
	String competition_name;
	String prediction;
	String competition_cluster;
	String status;
	String start_date;
	HashMap<String, Double> odds = new HashMap<String, Double>();

	public BetPrediction() {
	    odds.put("1", 0.0);
	    odds.put("2", 0.0);
	    odds.put("12", 0.0);
	    odds.put("X", 0.0);
	    odds.put("1X", 0.0);
	    odds.put("X2", 0.0);
	}
	
}


