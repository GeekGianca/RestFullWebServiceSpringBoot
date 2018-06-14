package com.geekprogrammer.restapi.core.model;

import com.geekprogrammer.restapi.core.entities.ProviderEntity;

public class ProviderModel {
	private String nit;
	private String representant;
	private String address;
	private String city;
	private String departament;
	private String movilphone;
	private String landline;
	private String email;
	private String typeprovider;
	private String name;
	
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getRepresentant() {
		return representant;
	}
	public void setRepresentant(String representant) {
		this.representant = representant;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartament() {
		return departament;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	public String getMovilphone() {
		return movilphone;
	}
	public void setMovilphone(String movilphone) {
		this.movilphone = movilphone;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTypeprovider() {
		return typeprovider;
	}
	public void setTypeprovider(String typeprovider) {
		this.typeprovider = typeprovider;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ProviderModel(ProviderEntity pdrEntity) {
		this.nit = pdrEntity.getNit();
		this.representant = pdrEntity.getRepresentante();
		this.address = pdrEntity.getDireccion();
		this.city = pdrEntity.getCiudad();
		this.departament = pdrEntity.getDepartamento();
		this.movilphone = pdrEntity.getTelmovil();
		this.landline = pdrEntity.getTelfijo();
		this.email = pdrEntity.getEmail();
		this.typeprovider = pdrEntity.getTipoproveedor();
		this.name = pdrEntity.getNombre();
	}
	
	public ProviderModel(String nit, String representant, String address, String city, String departament,
			String movilphone, String landline, String email, String typeprovider, String name) {
		this.nit = nit;
		this.representant = representant;
		this.address = address;
		this.city = city;
		this.departament = departament;
		this.movilphone = movilphone;
		this.landline = landline;
		this.email = email;
		this.typeprovider = typeprovider;
		this.name = name;
	}
	
	public ProviderModel() {
		
	}
	
}
