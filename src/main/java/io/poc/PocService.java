package io.poc;

public interface PocService {
	
	PocDto create(PocDto advertiser); //create

	PocDto getByUserId(long id); //get by public id

	PocDto update(long id , PocDto sendDto);

	void delete(long parseInt);

}
