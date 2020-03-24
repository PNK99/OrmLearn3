package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.CountryService;

@Controller
public class MainController {
 @Autowired
	CountryService countryService;
	
	@RequestMapping("/")
	public void get() {
		System.out.println(countryService.search("gre"));
	System.out.println(countryService.searchAsc("gre"));
	System.out.println(countryService.searchCharacter('A'));
	}
}
