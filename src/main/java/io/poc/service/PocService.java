package io.poc.service;

import java.util.List;

import io.poc.model.PocDto;
import io.poc.model.PocResponseEntity;
import io.poc.model.SomeFeildsDTO;

public interface PocService {

	PocDto create(PocDto advertiser); //create

	PocDto getByUserId(long id); 

	PocDto update(long id , PocDto sendDto);

	void delete(long parseInt);

	List<PocResponseEntity> getAll();

	SomeFeildsDTO getSomeFeilds(long id);


}
