package it.softwareinside.football.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.softwareinside.football.model.BetPrediction;
import it.softwareinside.football.repository.PredictionRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ServicePrediction {

	@Autowired
	PredictionRepository predictionRepository;
	

	@Scheduled(cron = "0 */2 * * * ?")
	public void takePrediction() throws IOException {
		String urlAPI = "https://football-prediction-api.p.rapidapi.com/api/v2/predictions";
		ObjectMapper mapper = new ObjectMapper();
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(urlAPI).addHeader("X-RapidAPI-Key", "049c8e8355msh240a19241f4f49ep197dd2jsna4f72aea7331").build();
		try (Response response = client.newCall(request).execute()) {
			JsonNode actualObj = mapper.readTree(response.body().string());
			for (int i = 0; i < actualObj.get("data").size(); i++) {
				BetPrediction prediction = new ObjectMapper().readValue(actualObj.get("data").get(i).toString(),BetPrediction.class);		
				predictionRepository.save(prediction);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<BetPrediction> predictions() {
		return predictionRepository.findAll();
	}
}
