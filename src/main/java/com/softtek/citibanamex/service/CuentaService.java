package com.softtek.citibanamex.service;

import java.util.List;

import com.softtek.citibanamex.entity.Cuenta;

public interface CuentaService {
	public List<Cuenta> getCuentas();
	
	public Cuenta getCuenta(long idCuenta);
}
