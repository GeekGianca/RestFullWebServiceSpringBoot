package com.geekprogrammer.restapi.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.geekprogrammer.restapi.core.converter.ProviderConverter;
import com.geekprogrammer.restapi.core.entities.ProviderEntity;
import com.geekprogrammer.restapi.core.model.ProviderModel;
import com.geekprogrammer.restapi.core.repository.ProviderRepository;

@Service("serviceProvider")
public class ProviderService {
	@Autowired
	@Qualifier("repositoryProvider")
	private ProviderRepository repository;
	
	@Autowired
	@Qualifier("converterProvider")
	private ProviderConverter converter;
	
	public boolean create(ProviderEntity provider) {
		try {
			repository.save(provider);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(ProviderEntity provider) {
		try {
			repository.save(provider);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean delete(String nit, String name) {
		try {
			ProviderEntity pdr = repository.findByNombreAndNit(nit, name);
			repository.delete(pdr);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<ProviderModel> select(ProviderEntity pdrEntity) {
		return converter.convertList(repository.findAll());
	}
	
	public ProviderModel getProviderByNit(String nit) {
		return new ProviderModel(repository.findByNit(nit));
	}
	
	public List<ProviderModel> getProvider(String provider){
		return converter.convertList(repository.findByNombre(provider));
	}
	
}
