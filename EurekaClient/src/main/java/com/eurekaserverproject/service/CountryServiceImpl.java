package com.eurekaserverproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurekaserverproject.entity.Country;
import com.eurekaserverproject.repo.CountryRepo;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	public CountryRepo cntryRepo;

	@Override
	public List<Country> getCountryDetails() {

		return cntryRepo.findAll();
	}

	@Override
	public String saveContryDetails(Country cntry) {
		
	//	Country contry=new Country();
		Country cn=	cntryRepo.save(cntry);
		System.out.println(cn);
		String msg="";
				if(cn!=null) {
					msg="added";
					return msg;
					
				}
				else {
					msg="not added";
					return msg;
				}
				
				// return msg;
	
	}

}
