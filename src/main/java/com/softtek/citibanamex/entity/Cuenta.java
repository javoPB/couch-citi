package com.softtek.citibanamex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "cuentas")
public class Cuenta {
	
	@Id
	@Column(name = "id_cuenta")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCuenta;
	
	private String descripcion;
	private String titular;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idBanco", nullable = false)
	@JsonIgnore
	private Banco banco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMoneda")
	@JsonIgnore
	private Moneda moneda;
	
	public long getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(long idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
	
}
