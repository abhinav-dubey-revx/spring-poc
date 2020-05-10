package io.poc.service.impl;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.poc.controller.PocController;
import io.poc.entity.PocEntity;
import io.poc.model.PocDto;
import io.poc.model.PocResponseEntity;
import io.poc.model.SomeFeildsDTO;
import io.poc.repo.PocRepository;
import io.poc.service.PocService;
import io.poc.utils.Helper;


@Service
public class PocServiceImpl implements PocService {

	private static final Logger logger = LogManager.getLogger(PocServiceImpl.class);

	private static final Logger FOG = LogManager.getLogger(PocServiceImpl.class);



	@Autowired
	PocRepository repository;

	@Autowired
	Helper helper;

	@Override
	public PocDto create(PocDto advertiser) {
		PocEntity entity = new PocEntity();
		BeanUtils.copyProperties(advertiser, entity);
		PocEntity createdAdv = repository.save(entity); // saving
		PocDto returnVal = new PocDto(); // making object to be returned to UI
		BeanUtils.copyProperties(createdAdv, returnVal);
		return returnVal;
	}


	@Override
	public PocDto getByUserId(long id) {
		logger.trace("trace - ServiceImpl !!!");
		logger.debug("Debug - ServiceImpl !!!!");
		logger.info("info - ServiceImpl !!!!");
		logger.warn("warn - ServiceImpl !!!!");
		logger.error("error - ServiceImpl !!!!");
		logger.fatal("fatal - ServiceImpl !!!!");

		//		FOG.trace("trace - ServiceImpl !!!");
		//		FOG.debug("Debug - ServiceImpl !!!!");
		//		FOG.info("info - ServiceImpl !!!!");
		//		FOG.warn("warn - ServiceImpl !!!!");
		//		FOG.error("error - ServiceImpl !!!!");
		//		FOG.fatal("fatal - ServiceImpl !!!!");

		PocDto returnVal = new PocDto(); 
		//check for null object i.e.EXCEPTION
		PocEntity entityReceived = repository.searchSQLById(id);//repository.findById(userId);
		BeanUtils.copyProperties(entityReceived, returnVal);
		return returnVal;
	}


	@Override
	public PocDto update(long id , PocDto updatedDto) {
		//check first if user with id exist
		PocDto returnVal = new PocDto(); 
		PocEntity entity = repository.searchSQLById(id);//repository.findById(userId);
		PocEntity updatedAdv  = repository.save(entity);
		BeanUtils.copyProperties(updatedAdv, returnVal);
		return returnVal;
	}


	@Override
	public void delete(long id) {
		PocEntity deleteEntity = repository.searchSQLById(id);//repository.findById(id);
		repository.delete(deleteEntity);

	}


	@Override
	public List<PocResponseEntity> getAll() {
		List<PocEntity> iterable = repository.findAll();
		List<PocResponseEntity> returnList = new ArrayList<PocResponseEntity>();
		for (PocEntity i : iterable) {
			PocResponseEntity returnElement = new PocResponseEntity();
			BeanUtils.copyProperties(i, returnElement);
			returnList.add(returnElement);
		}
		return returnList;
	}



	@Override
	public SomeFeildsDTO getSomeFeilds(long id) {
		SomeFeildsDTO someFeildsDTO = new SomeFeildsDTO();
		someFeildsDTO = repository.getSomeFeilds(id);
		return someFeildsDTO;
	}


}
