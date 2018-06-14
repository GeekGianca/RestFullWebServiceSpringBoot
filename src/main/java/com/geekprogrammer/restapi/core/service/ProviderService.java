package com.geekprogrammer.restapi.core.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
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
	
	private static final Log logger = LogFactory.getLog(ProviderService.class); 
	
	public boolean create(ProviderEntity provider) {
		logger.info("Creating provider");
		try {
			repository.save(provider);
			logger.info("Provider create");
			return true;
		}catch(Exception e) {
			logger.error("Error in create provider "+e.getMessage());
			return false;
		}
	}
	
	public boolean update(ProviderEntity provider) {
		logger.info("Updating provider");
		try {
			repository.save(provider);
			logger.info("Provider Update");
			return true;
		}catch(Exception e) {
			logger.error("Error while update provider "+e.getMessage());
			return false;
		}
	}
	
	public boolean delete(String nit) {
		logger.info("Deleting provider");
		try {
			ProviderEntity pdr = repository.findByNit(nit);
			repository.delete(pdr);
			logger.info("Provider delete");
			return true;
		}catch(Exception e) {
			logger.error("Error while delete provider "+e.getMessage());
			return false;
		}
	}
	
	public List<ProviderModel> select() {
		logger.info("Selecting providers");
		return converter.convertList(repository.findAll());
	}
	
	public ProviderModel getProviderByNit(String nit) {
		logger.info("Select provider with nit "+nit);
		return new ProviderModel(repository.findByNit(nit));
	}
	
	public List<ProviderModel> getProvider(String provider){
		logger.info("Selecting provider with name "+provider);
		return converter.convertList(repository.findByNombre(provider));
	}
	
	public List<ProviderModel> getProviderWithPage(Pageable pages){
		return converter.convertList(repository.findAll(pages).getContent());
	}
	
}
