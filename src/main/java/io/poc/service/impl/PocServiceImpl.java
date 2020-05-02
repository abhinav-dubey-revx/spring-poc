package io.poc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.poc.entity.PocEntity;
import io.poc.model.PocDto;
import io.poc.model.PocResponseEntity;
import io.poc.model.StrategyQuickEditDTO;
import io.poc.repo.PocRepository;
import io.poc.service.PocService;
import io.poc.utils.Helper;


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

//		entity.setEncryptedPassword("test");
//		entity.setUserId(helper.getRandomUserId());
		PocEntity createdAdv = repository.save(entity); // saving

		PocDto returnVal = new PocDto(); // making object to be returned to UI
		BeanUtils.copyProperties(createdAdv, returnVal);
		return returnVal;
	}

	@Override
	public PocDto getByUserId(long userId) {
		PocDto returnVal = new PocDto(); 
		//check for null object i.e.EXCEPTION
		PocEntity entityReceived = repository.findById(userId);
		BeanUtils.copyProperties(entityReceived, returnVal);
		return returnVal;
	}

	@Override
	public PocDto update(long userId , PocDto updatedDto) {
		//check first if user with id exist
		PocDto returnVal = new PocDto(); 
		PocEntity entity = repository.findById(userId);

//		entity.setFirstName(updatedDto.getFirstName()); //ONLY UPDATING FN and LN
//		entity.setLastName(updatedDto.getLastName());
		PocEntity updatedAdv  = repository.save(entity);

		BeanUtils.copyProperties(updatedAdv, returnVal);
		return returnVal;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		PocEntity deleteEntity = repository.findById(id);
		repository.delete(deleteEntity);

	}

	@Override
	public List<PocResponseEntity> getAll() {
		//		// TODO Auto-generated method stub
		//		Iterable<PocEntity> iterable = repository.findAll();
		//		List<PocResponseEntity> returnList = new ArrayList<PocResponseEntity>();
		//		Itera
		//		
		return null;

	}

//	@Override
//	public StrategyQuickEditDTO getCastDetails(Long id) {
//		StrategyQuickEditDTO strategyQuickEditDTO = new StrategyQuickEditDTO();
//		strategyQuickEditDTO = repository.getCastDetails(id);
//		if (strategyQuickEditDTO == null) {
//			//new Exception("Strategy id is not valid");
//		}
//		return strategyQuickEditDTO;
//	}
//	
//	@Override
//	public Object random() {
//		return repository.random();
//	}


}
