package com.eurekaserverproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaserverproject.entity.Country;
import com.eurekaserverproject.service.CountryServiceImpl;

@RestController
//@CrossOrigin(origins = "http://localhost:3000/")
public class CountryControl {
	@Autowired
	public CountryServiceImpl cntryServiceImpl;

	@GetMapping("/cntry")
	public List<Country> getAllData() {
		return cntryServiceImpl.getCountryDetails();
	}

	@PostMapping("/addCntry")
	public String  saveCountry(@RequestBody Country cntry) {
		System.out.println(cntry+"   its cntr");
String cs=		 cntryServiceImpl.saveContryDetails(cntry);
		return cs;
		
	}

}
