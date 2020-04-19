package io.poc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface PocRepository extends CrudRepository<PocEntity, Long> {

	PocEntity findByUserId(long userId); //Query methods : bcz spring makes query
	
	

}
