package com.geekprogrammer.restapi.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.geekprogrammer.restapi.core.entities.ProviderEntity;

@Repository("repositoryProvider")
public interface ProviderRepository extends JpaRepository<ProviderEntity, Serializable>, PagingAndSortingRepository<ProviderEntity, Serializable> {
	public abstract ProviderEntity findByNit(String nit);
	
	public abstract List<ProviderEntity> findByNombre(String name);
	
	public abstract ProviderEntity findByNombreAndNit(String nit, String name);
	
	public abstract Page<ProviderEntity> findAll(Pageable pageable);
}
