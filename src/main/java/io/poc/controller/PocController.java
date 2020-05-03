package io.poc.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.poc.exception.ErrorMessages;
import io.poc.exception.ApiException;
import io.poc.model.PocDto;
import io.poc.model.PocRequestModel;
import io.poc.model.PocResponseEntity;
import io.poc.model.SomeFeildsDTO;
import io.poc.service.PocService;
import io.poc.utils.Helper;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/advertiser") // http:localhost:<port>/advertiser/<mapping_url>
public class PocController {

	private static final Logger logger = LogManager.getLogger(PocController.class);

	@Autowired
	PocService service;

	@Autowired
	Helper helper;


	@ApiOperation(value="Creates new Advertiser" , notes= "return public user id.")
	@PostMapping("/create")
	public PocResponseEntity create(@RequestBody PocRequestModel advertiserReq) throws Exception {
		PocResponseEntity returnVal = new PocResponseEntity();
		//helper.validateCreateRequest(advertiserReq);
		PocDto DO = new PocDto();
		BeanUtils.copyProperties(advertiserReq, DO); // advertiserReq -> db object
		PocDto createdDto = service.create(DO);
		BeanUtils.copyProperties(createdDto, returnVal); // createdAdv -> resp object

		return returnVal;
	}


	@ApiOperation(value="get all advertiser" , notes= "all Advertiser from AdX.Advertiser")
	@GetMapping("/get/all")
	public List<PocResponseEntity> getAll() {
		return service.getAll();
	}

	@ApiOperation(value="get advertiser by Id" , notes= "advertiser from DB : from AdX.Advertiser")
	@GetMapping(path = "/get/{id}")
	public PocResponseEntity getById(@PathVariable String id) {
		PocResponseEntity returnVal = new PocResponseEntity();
		PocDto dto = service.getByUserId(Long.parseLong(id));
		BeanUtils.copyProperties(dto, returnVal);
		return returnVal;
	}

	@ApiOperation(value="edit an advertiser" , notes= "updates advertiser in db")
	@PutMapping(path = "/update/{id}")
	public PocResponseEntity update(@RequestBody PocRequestModel updateReq, @PathVariable String id) {
		PocResponseEntity returnVal = new PocResponseEntity();
		PocDto sendDto = new PocDto();
		BeanUtils.copyProperties(updateReq, sendDto); // advertiserReq -> dbDto
		PocDto reveivedDto = service.update(Long.parseLong(id), sendDto);
		BeanUtils.copyProperties(reveivedDto, returnVal);
		return returnVal;
	}

	@ApiOperation(value="delete an advertiser" , notes= "deletes advertiser in db")
	@DeleteMapping(path = "/delete/{id}")
	public String delete(@PathVariable String id) {
		service.delete(Long.parseLong(id));
		return "deleted";
	}


	@ApiOperation(value="get some feilds of advertiser by Id" , notes= "feilds of advertiser from DB : from AdX.Advertiser")
	@GetMapping(path = "/getSomeFeilds/{id}")
	public SomeFeildsDTO getSomeFeilds(@PathVariable String id) {
		SomeFeildsDTO someFeildsDTO = new SomeFeildsDTO();
		someFeildsDTO =  service.getSomeFeilds(Long.parseLong(id));
		return someFeildsDTO;
	}



}
