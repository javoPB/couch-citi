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

@Entity(name = "bancos")
public class Banco {
	@Id
	@Column(name = "id_banco")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long idBanco;
	
	private String nombre;
	
	@OneToMany(mappedBy = "banco", fetch = FetchType.LAZY)
	private Set<Cuenta> lstCuentas;

	
	public Set<Cuenta> getLstCuentas() {
		return lstCuentas;
	}

	public void setLstCuentas(Set<Cuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}

	public long getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(long idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
