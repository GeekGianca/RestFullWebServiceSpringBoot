package com.geekprogrammer.restapi.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.geekprogrammer.restapi.core.entities.ProviderEntity;
import com.geekprogrammer.restapi.core.model.ProviderModel;

@Component("converterProvider")
public class ProviderConverter {
	
	public List<ProviderModel> convertList(List<ProviderEntity> pdrEntity){
		List<ProviderModel> provider = new ArrayList<>();
		for(ProviderEntity entity : pdrEntity) {
			provider.add(new ProviderModel(entity));
		}
		return provider;
	}
	
}
