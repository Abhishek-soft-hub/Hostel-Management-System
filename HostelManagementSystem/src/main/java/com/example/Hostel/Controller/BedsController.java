package com.example.Hostel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hostel.Constants.Successfull;
import com.example.Hostel.ServiceImplementations.BedServiceImpl;
import com.example.Hostel.entity.Beds;
import com.example.Hostel.service.BedsService;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class BedsController {

	@Autowired
	private BedsService bedsService;

	@GetMapping("availableBeds/{shearing}/{hostelId}")
	public ResponseEntity getAvailableBeds(@PathVariable int shearing, @PathVariable int hostelId) {
		return new ResponseEntity(bedsService.getAvaiableBeds(shearing, hostelId), HttpStatus.OK);

	}

	@DeleteMapping("delete/bed/{id}")
	public ResponseEntity deleteBeds(@PathVariable int id) {
		bedsService.deleteBeds(id);
		return new ResponseEntity(Successfull.DELETE, HttpStatus.OK);
	}
	
	@PutMapping("bed/update/{id}")
	public ResponseEntity update(@PathVariable int id) {
		bedsService.updateBeds(id);
		return new ResponseEntity(Successfull.UPDATE, HttpStatus.OK);
		
	}
	
	@GetMapping("bed/get/{id}")
	public ResponseEntity getBed(@PathVariable int id) {
		return new ResponseEntity(bedsService.getBed(id) , HttpStatus.OK);
	}
	
	@GetMapping("getBeds")
	public ResponseEntity getBeds() {
		return new ResponseEntity(bedsService.getBeds(), HttpStatus.OK);
		
	}

}
