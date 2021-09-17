package it.softwareinside.football.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.football.model.BetPrediction;

@Repository
public interface PredictionRepository extends MongoRepository<BetPrediction, Long>{

}
