package com.geekprogrammer.restapi.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekprogrammer.restapi.core.entities.ProviderEntity;
import com.geekprogrammer.restapi.core.model.ProviderModel;
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

    @PostMapping("/provider")
    public boolean updateProvider(@RequestBody @Valid ProviderEntity pdrEnt) {
        return service.update(pdrEnt);
    }

    @DeleteMapping("/provider/{nit}")
    public boolean deleteProvider(@PathVariable("nit") String nit) {
        return service.delete(nit);
    }

    @GetMapping("/providers")
    public List<ProviderModel> selectProvider(Pageable pages) {
        return service.getProviderWithPage(pages);
    }

}
