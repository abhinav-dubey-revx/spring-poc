package io.poc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PocRepository extends CrudRepository<PocEntity, Integer> {

}
