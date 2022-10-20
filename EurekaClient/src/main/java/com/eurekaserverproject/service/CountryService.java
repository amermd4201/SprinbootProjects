package com.eurekaserverproject.service;

import java.util.List;

import com.eurekaserverproject.entity.Country;

public interface CountryService {
	
	public List<Country>getCountryDetails();
    public String saveContryDetails(Country cntry);
	
}
