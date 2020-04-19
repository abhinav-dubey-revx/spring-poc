package io.poc;

import java.util.Arrays;
import java.util.List;

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

@RestController
@RequestMapping("/advertiser") // http:localhost:<port>/advertiser/<mapping_url>
public class PocController {

	@Autowired
	PocRepository repo;

	@Autowired
	PocService service;

	// @PostMapping("/create")
//	public String create(@RequestBody PocEntity advertisers) {
//		repo.save(advertisers);
//		return "saved";
//	}
//
//	@GetMapping("/getAll")
//	public List<PocEntity> getAll() {
//		return (List<PocEntity>) repo.findAll();
//	}
//
//	@GetMapping("/get/{id}")
//	public PocEntity getById(@PathVariable String id) {
//		return repo.findById(Integer.parseInt(id)).get();	
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String delete(@PathVariable String id) {
//		repo.deleteById(Integer.parseInt(id));
//		return "deleted";
//	}
//	
//	@PutMapping("/update/{id}")
//	public String update(@RequestBody PocEntity advertiser) {
//		repo.save(advertiser);
//		return "updated";
//	}

	@PostMapping("/create")
	public PocResponseEntity create(@RequestBody PocRequestModel advertiserReq) {
		PocResponseEntity returnVal = new PocResponseEntity();
		PocDto sendDto = new PocDto();
		BeanUtils.copyProperties(advertiserReq, sendDto); // advertiserReq -> dbDto
		PocDto createdDto = service.create(sendDto);
		BeanUtils.copyProperties(createdDto, returnVal); // createdAdv -> returnVal
		return returnVal;
	}

	@GetMapping("/getAll")
	public List<PocEntity> getAll() {
		return (List<PocEntity>) repo.findAll();
	}

	@GetMapping(path = "/get/{id}")
	public PocResponseEntity getById(@PathVariable String id) {
		PocResponseEntity returnVal = new PocResponseEntity();
		PocDto dto = service.getByUserId(Long.parseLong(id));
		BeanUtils.copyProperties(dto, returnVal);
		return returnVal;
	}

	@PutMapping(path = "/update/{id}")
	public PocResponseEntity update(@RequestBody PocRequestModel updateReq, @PathVariable String id) {
		PocResponseEntity returnVal = new PocResponseEntity();
		PocDto sendDto = new PocDto();
		BeanUtils.copyProperties(updateReq, sendDto); // advertiserReq -> dbDto
		PocDto reveivedDto = service.update(Long.parseLong(id), sendDto);
		BeanUtils.copyProperties(reveivedDto, returnVal);
		return returnVal;
	}

	@DeleteMapping(path = "/delete/{id}")
	public String delete(@PathVariable String id) {
		service.delete(Long.parseLong(id));
		return "deleted";
	}

}
