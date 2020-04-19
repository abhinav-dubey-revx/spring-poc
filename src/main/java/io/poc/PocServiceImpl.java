package io.poc;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PocServiceImpl implements PocService {

	@Autowired
	PocRepository repository;

	@Autowired
	Helper helper;

	@Override
	public PocDto create(PocDto advertiser) {
		PocEntity entity = new PocEntity();
		BeanUtils.copyProperties(advertiser, entity);

		entity.setEncryptedPassword("test");
		entity.setUserId(helper.getRandomUserId());
		PocEntity createdAdv = repository.save(entity); // saving

		PocDto returnVal = new PocDto(); // making object to be returned to UI
		BeanUtils.copyProperties(createdAdv, returnVal);
		return returnVal;
	}

	@Override
	public PocDto getByUserId(long userId) {
		PocDto returnVal = new PocDto(); 
		//check for null object i.e.EXCEPTION
		PocEntity entityReceived = repository.findByUserId(userId);
		BeanUtils.copyProperties(entityReceived, returnVal);
		return returnVal;
	}

	@Override
	public PocDto update(long userId , PocDto updatedDto) {
		//check first if user with id exist
		PocDto returnVal = new PocDto(); 
		PocEntity entity = repository.findByUserId(userId);
		
		entity.setFirstName(updatedDto.getFirstName()); //ONLY UPDATING FN and LN
		entity.setLastName(updatedDto.getLastName());
		PocEntity updatedAdv  = repository.save(entity);

		BeanUtils.copyProperties(updatedAdv, returnVal);
		return returnVal;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		PocEntity deleteEntity = repository.findByUserId(id);
		repository.delete(deleteEntity);
		
	}

}
