package com.geekprogrammer.restapi.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class ProviderEntity implements Serializable {

	@Id
	@Column(name="NIT")
	private String nit;
	
	@Column(name="REPRESENTANTE")	
	private String representante;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="DEPARTAMENTO")
	private String departamento;
	
	@Column(name="TELMOVIL")
	private String telmovil;
	
	@Column(name="TELFIJO")
	private String telfijo;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TIPOPROVEEDOR")
	private String tipoproveedor;
	
	@Column(name="NOMBRE")
	private String nombre;

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTelmovil() {
		return telmovil;
	}

	public void setTelmovil(String telmovil) {
		this.telmovil = telmovil;
	}

	public String getTelfijo() {
		return telfijo;
	}

	public void setTelfijo(String telfijo) {
		this.telfijo = telfijo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoproveedor() {
		return tipoproveedor;
	}

	public void setTipoproveedor(String tipoproveedor) {
		this.tipoproveedor = tipoproveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public ProviderEntity(String nit, String representante, String direccion, String ciudad, String departamento,
			String telmovil, String telfijo, String email, String tipoproveedor, String nombre) {
		this.nit = nit;
		this.representante = representante;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.telmovil = telmovil;
		this.telfijo = telfijo;
		this.email = email;
		this.tipoproveedor = tipoproveedor;
		this.nombre = nombre;
	}

	public ProviderEntity() {
		
	}
}
