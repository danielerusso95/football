package it.softwareinside.football.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import it.softwareinside.football.model.Partite;

@Repository
public interface PartiteRepository extends MongoRepository<Partite, String> {
	
	

}
