package com.geekprogrammer.restapi.core.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekprogrammer.restapi.core.entities.ProviderEntity;
import com.geekprogrammer.restapi.core.service.ProviderService;

@RestController
@RequestMapping("/v1")
public class ProviderController {
	@Autowired
	@Qualifier("serviceProvider")
	ProviderService service;
	
	@PutMapping("/provider")
	public boolean addProvider(@RequestBody @Valid ProviderEntity pdrEnt) {
		return service.create(pdrEnt);
	}
	
}
