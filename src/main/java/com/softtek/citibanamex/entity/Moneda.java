package com.softtek.citibanamex.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "monedas")
public class Moneda {
	@Id
	@Column(name = "id_moneda")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long idMoneda;
	
	private String nombre;
	
	@OneToMany(mappedBy = "moneda", fetch = FetchType.LAZY)
	private Set<Cuenta> lstCuentas;
	
	
	public Set<Cuenta> getLstCuentas() {
		return lstCuentas;
	}
	public void setLstCuentas(Set<Cuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}
	public long getIdMoneda() {
		return idMoneda;
	}
	public void setIdMoneda(long idMoneda) {
		this.idMoneda = idMoneda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
