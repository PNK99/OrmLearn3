package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Country;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
@Transactional
	public List<Country> getAllCountries() {
		System.out.println("here");
		System.out.println(countryRepository.findAll());
		if(countryRepository.findAll()==null)
			return new ArrayList<Country>();
		return countryRepository.findAll();
	}
@Transactional
	public Country findCountryByCode(String ccode) {
		Country country = null;
		System.out.println("here");
		Optional<Country> optC = countryRepository.findById(ccode);
		if (optC.isPresent())
			return optC.get();
		return country;
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(Country newCountry) {
		Country country = null;
		
		Optional<Country> optC = countryRepository.findById(newCountry.getCode());
		if (optC.isPresent())
			country = optC.get();
		country.setName(newCountry.getName());
		countryRepository.save(country);
	}
	@Transactional
	public void deleteCountry(String cCode) {
		Country country = null;
		Optional<Country> optC = countryRepository.findById(cCode);
		if (optC.isPresent())
			country = optC.get();
		countryRepository.delete(country);
	}

	@Transactional
	public List<Country>  search (String s){
		return countryRepository.findByNameContaining(s);
	}
	@Transactional
	public List<Country>  searchAsc (String s){
		return countryRepository.findByNameContainingOrderByNameAsc(s);
	
	}
	@Transactional
	public List<Country>  searchCharacter (Character s){
		return countryRepository.findByCharacter(s);
	}
}
