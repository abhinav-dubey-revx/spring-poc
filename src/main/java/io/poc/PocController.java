package io.poc;

import java.util.Arrays;
import java.util.List;

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
@RequestMapping("/advertiser")
public class PocController {

	@Autowired
	PocRepository repo;

	@PostMapping("/create")
	public String create(@RequestBody PocEntity advertisers) {
		repo.save(advertisers);
		return "saved";
	}

	@GetMapping("/getAll")
	public List<PocEntity> getAll() {
		return (List<PocEntity>) repo.findAll();
	}

	@GetMapping("/get/{id}")
	public PocEntity getById(@PathVariable String id) {
		return repo.findById(Integer.parseInt(id)).get();	
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable String id) {
		repo.deleteById(Integer.parseInt(id));
		return "deleted";
	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody PocEntity advertiser) {
		repo.save(advertiser);
		return "updated";
	}

}
